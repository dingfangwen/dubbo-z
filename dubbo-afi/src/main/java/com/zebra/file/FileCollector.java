package com.zebra.file;

import java.io.File;

import com.zebra.Global;
import org.apache.log4j.Logger;


/**
 * 文件搜集器
 * 负责扫描指定目录下内容，根据ctr文件扫描到csv文件
 * 将扫描到的文件存储起来等待其他线程处理
 * @author park
 *
 */
public class FileCollector implements Runnable{
	private Logger logger = Logger.getLogger(FileCollector.class);
	@Override
	public void run() {
		Thread.currentThread().setName("FileCollector_Thread");
		try {
			while(true){
				//1.获取根路径下所有的子File对象
				File baseDir = new File(Global.getBasedir());
				File [] fs = baseDir.listFiles();
				//2.遍历
				for(File f : fs){
					if(f.isDirectory()){
						//如果是文件夹，不处理
						continue;
					}else{
						//如果是个文件，判断是不是ctr文件
						if(f.getName().endsWith(".ctr")){
							//如果有ctr，则找到对应的csv存储起来
							String csvPath = f.getPath().substring(0, f.getPath().length()-".ctr".length())+".csv";
							File csvFile = new File(csvPath);
							Global.getFilequeue().put(csvFile);
							logger.info("将文件加入FileQueue:"+csvFile.getName());
							//删除ctr文件防止重复处理
							f.delete();
						}else{
							continue;
						}
					}
				}

				//每10秒钟，重复扫描一次
				Thread.sleep(10*1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

}
