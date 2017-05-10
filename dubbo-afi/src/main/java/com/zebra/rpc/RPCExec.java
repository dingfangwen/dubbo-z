package com.zebra.rpc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.zebra.Global;
import com.zebra.domain.Engin2Info;
import com.zebra.domain.HTTPAPPHost;
import com.zebra.domain.RPCInfo;
import com.zebra.net.NIOClient;
import org.apache.log4j.Logger;
import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Message;
import com.google.protobuf.RpcController;
import com.google.protobuf.ServiceException;

public class RPCExec {
	private static Logger logger = Logger.getLogger(RPCExec.class);
	public static void seriaAndSend(Map<String,List<HTTPAPPHost>> map){
		try {
			//1.遍历Map
			for(Map.Entry<String, List<HTTPAPPHost>> entry : map.entrySet()){
				//2.将List序列化
				List<HTTPAPPHost> list = entry.getValue();
				List<RPCInfo.RPCReq.RPCHah> rpcList = new ArrayList<RPCInfo.RPCReq.RPCHah>();
				for(HTTPAPPHost hah : list){
					RPCInfo.RPCReq.RPCHah rpchah = RPCInfo.RPCReq.RPCHah.newBuilder()
							.setCellid(hah.getCellid())
							.setAppType(hah.getAppType())
							.setAppSubtype(hah.getAppSubtype())
							.setUserIP(hah.getUserIP())
							.setUserPort(hah.getUserPort())
							.setAppServerIP(hah.getAppServerIP())
							.setAppServerPort(hah.getAppServerPort())
							.setTrafficUL(hah.getTrafficUL())
							.setTrafficDL(hah.getTrafficDL())
							.setRetranUL(hah.getRetranUL())
							.setRetranDL(hah.getRetranDL())
							.setHost(hah.getHost())
							.setReportTime(hah.getReportTime().getTime())
							.setSliceType(hah.getSliceType())
							.setSlice(hah.getSlice())
							.setTransDelay(hah.getTransDelay())
							.setShufflekey(hah.getShufflekey())
							.setAttempts(hah.getAttempts())
							.setAccepts(hah.getAccepts())
							.setFailCount(hah.getFailCount())
							.build();
					rpcList.add(rpchah);
				}
				logger.info("准备调用网络模块向二级引擎发送数据，数据量："+rpcList.size()+"个hah对象");
				RPCInfo.RPCReq req = RPCInfo.RPCReq.newBuilder().addAllHahs(rpcList).setMname("reduce").build();
				//3.找到ShuffleKey对应的二级引擎
				final Engin2Info e2info = Global.getE2map().get(entry.getKey());
				//4.调用远程方法--通过网络模块--将数据发送到二级引擎
				RPCInfo.ReduceService.BlockingInterface service = RPCInfo.ReduceService.newBlockingStub(new BlockingRpcChannel() {

					@Override
					public Message callBlockingMethod(MethodDescriptor md,
													  RpcController contorller, Message req, Message resp)
							throws ServiceException {
						try {
							//实现真正的远程调用
							byte [] data = req.toByteArray();
							e2info.getDataQueue().put(data);
							NIOClient.sendData(e2info);
						} catch (InterruptedException e) {
							e.printStackTrace();
							throw new RuntimeException(e);
						}
						return null;
					}
				});

				service.reduce(null, req);
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}
