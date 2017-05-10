package com.zebra.exec;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.zebra.Global;
import com.zebra.domain.HTTPAPPHost;
import com.zebra.domain.OtherInfo;
import com.zebra.rpc.RPCExec;
import org.apache.log4j.Logger;



/**
 * 读取行转为对象
 * 进行业务处理
 * 进行数据预处理
 * 调用网络模块将数据发送给二级引擎
 *
 * @author park
 *
 */
public class Exec implements Runnable {
	private Logger logger = Logger.getLogger(Exec.class);

	private static Map<String,Integer> map = new LinkedHashMap<String,Integer>();
	private static Map<String,Integer> map2 = new LinkedHashMap<String,Integer>();
	static{
		//基站中一行数据中各个指标的位置即为key
		map.put("cellid",17);
		map.put("appType",23);
		map.put("appSubtype",24);
		map.put("userIP",27);
		map.put("userPort",29);
		map.put("appServerIP",31);
		map.put("appServerPort",33);
		map.put("host",59);

		map2.put("reportTimeStr",0);
		map2.put("appTypeCode",19);
		map2.put("procdureStartTime",20);
		map2.put("procdureEndTime",21);
		map2.put("transStatus",55);
		map2.put("interruptType",68);
		map2.put("trafficUL",34);
		map2.put("trafficDL",35);
		map2.put("retranUL",40);
		map2.put("retranDL",41);
	}

	/**
	 * 设置javabean属性
	 * @param clz
	 * @param obj
	 * @param attrs
	 * @param map
	 */
	private void setAttrs(Class clz,Object obj,String [] attrs,Map<String,Integer> map){
		try {
			for(Map.Entry<String, Integer> entry : map.entrySet()){
				String attrName = entry.getKey();
				PropertyDescriptor pd = new PropertyDescriptor(attrName,clz);
				Method wm = pd.getWriteMethod();
				if(pd.getPropertyType() == String.class){
					wm.invoke(obj, attrs[entry.getValue()]);
				}else if(pd.getPropertyType() == int.class || pd.getPropertyType() == Integer.class){
					wm.invoke(obj, Integer.parseInt(attrs[entry.getValue()]));
				}else if(pd.getPropertyType() == long.class || pd.getPropertyType() == Long.class){
					wm.invoke(obj, Long.parseLong(attrs[entry.getValue()]));
				}else{
					throw new RuntimeException("未支持的类型！");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

	@Override
	public void run() {
		Map<String,HTTPAPPHost> hahMap = new HashMap<String, HTTPAPPHost>();
		try {
			long beginTime = System.currentTimeMillis();
			while(true){
				//1.行转对象
				//阻塞读取行
				String line = Global.getLinequeue().poll(1,TimeUnit.SECONDS);

				if(line != null){
					//将行转换为对象
					String []  attrs = line.split("\\|");
					HTTPAPPHost hah = new HTTPAPPHost();
					setAttrs(HTTPAPPHost.class, hah, attrs, map);
					OtherInfo oi = new OtherInfo();
					setAttrs(OtherInfo.class, oi, attrs, map2);

					//2.进行业务处理
					//设置时间片信息
					String reportTimeStr = attrs[0];
					hah.setReportTime(new Timestamp(Long.parseLong(reportTimeStr)));
					hah.setSlice(Long.parseLong(reportTimeStr));
					//若cellId为空，补全成000000000
					if("".equals(hah.getCellid()) || hah.getCellid() == null){
						hah.setCellid("000000000");
					}
					//业务逻辑:尝试次数	HTTP_ATTEMPT	attempts	if( App Type Code=103 ) then counter++
					if(oi.getAppTypeCode() == 103){
						hah.setAttempts(1);
					}
					//业务逻辑：HTTP_Accept	accepts	if( App Type Code=103 & HTTP/WAP事物状态 in(10,11,12,13,14,15,32,33,34,35,36,37,38,48,49,50,51,52,53,54,55,199,200,201,202,203,204,205,206,302,304,306) && Wtp中断类型==NULL) then counter++
					String code = ",10,11,12,13,14,15,32,33,34,35,36,37,38,48,49,50,51,52,53,54,55,199,200,201,202,203,204,205,206,302,304,306,";
					if(oi.getAppTypeCode() == 103
							&&
							code.contains(","+oi.getTransStatus()+",")
							&&
							oi.getInterruptType() == null){
						hah.setAccepts(1);
					}
					//业务逻辑：Traffic_UL_HTTP	trafficUL	if( App Type Code=103  ) then counter = counter + UL Data
					//业务逻辑：traffic_DL_HTTP	trafficDL	if( App Type Code=103  ) then counter = counter + DL Data
					//业务逻辑：Retran_UL	retranUL	if( App Type Code=103  ) then counter = counter + 上行TCP重传报文数
					//业务逻辑：Retran_DL	retranDL	if( App Type Code=103  ) then counter = counter + 下行TCP重传报文数
					if(oi.getAppTypeCode() == 103){
						hah.setTrafficUL(oi.getTrafficUL());
						hah.setTrafficDL(oi.getTrafficDL());
						hah.setRetranUL(oi.getRetranUL());
						hah.setRetranDL(oi.getRetranDL());
					}
					//业务逻辑：HTTP_Fail_Count	failCount	if( App Type Code=103 &&  HTTP/WAP事务状态==1  &&  Wtp中断类型==NULL ) then counter = counter + 1
					if(oi.getAppTypeCode() == 103 && oi.getTransStatus() == 1 && oi.getInterruptType() == null){
						hah.setFailCount(1);
					}
					//设置TransDelay if( App Type Code=103  ) then counter = counter + (Procedure_End_time-Procedure_Start_time)
					if(oi.getAppTypeCode() == 103){
						hah.setTransDelay(oi.getProcdureEndTime() - oi.getProcdureStartTime());
					}
					//计算shufflekey
					String cellid = hah.getCellid();
					String shufflekey = (cellid.hashCode() % Global.getE2map().size() + 1)+"";
					hah.setShufflekey(shufflekey);

					//3.进行数据预处理
					//进行数据的聚合
					String key = hah.getSlice()+"|"+hah.getAppType()+"|"+hah.getAppSubtype()+"|"+hah.getUserIP()+"|"+hah.getUserPort()+"|"+hah.getAppServerIP()+"|"+hah.getAppServerPort()+"|"+hah.getHost()+"|"+hah.getCellid();
					if(hahMap.containsKey(key)){
						HTTPAPPHost before_hah = hahMap.get(key);
						before_hah.setAttempts(before_hah.getAttempts() + hah.getAttempts());
						before_hah.setAccepts(before_hah.getAccepts() + hah.getAccepts());
						before_hah.setTrafficUL(before_hah.getTrafficUL() + hah.getTrafficUL());
						before_hah.setTrafficDL(before_hah.getTrafficDL() + hah.getTrafficDL());
						before_hah.setRetranUL(before_hah.getRetranUL() + hah.getRetranUL());
						before_hah.setRetranDL(before_hah.getRetranDL() + hah.getRetranDL());
						before_hah.setFailCount(before_hah.getFailCount() + hah.getFailCount());
						before_hah.setTransDelay(before_hah.getTransDelay() + hah.getTransDelay());

					}else{
						hahMap.put(key, hah);
					}
				}
				//4.每隔5秒钟调用网络模块发送数据
				long nowTime = System.currentTimeMillis();
				if(nowTime - beginTime>=5000 && !hahMap.isEmpty()){
					//TODO 调用网络模块发送数据
					Map<String,List<HTTPAPPHost>> sendMap = new HashMap<String,List<HTTPAPPHost>>();
					for(Map.Entry<String, HTTPAPPHost> entry : hahMap.entrySet()){
						HTTPAPPHost hah = entry.getValue();
						if(sendMap.containsKey(hah.getShufflekey())){
							List<HTTPAPPHost> sendList = sendMap.get(hah.getShufflekey());
							sendList.add(hah);
						}else{
							List<HTTPAPPHost> sendList = new ArrayList<HTTPAPPHost>();
							sendList.add(hah);
							sendMap.put(hah.getShufflekey(), sendList);
						}
					}
					RPCExec.seriaAndSend(sendMap);
					logger.info("调用RPC模块发送数据，数据量："+hahMap.size()+"个对象");

					//清空hahMap，为下一次存储数据做准备
					hahMap.clear();

					//重置开始时间，重新计时
					beginTime = System.currentTimeMillis();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

}
