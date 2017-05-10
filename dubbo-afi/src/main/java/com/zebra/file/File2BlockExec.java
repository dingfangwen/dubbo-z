package com.zebra.file;

import java.io.File;

import com.zebra.Global;
import org.apache.log4j.Logger;



public class File2BlockExec implements Runnable {
	private Logger logger = Logger.getLogger(File2BlockExec.class);

	@Override
	public void run() {
		try {
			while(true){
				//从文件队列中拿出每一个文件
				File f = Global.getFilequeue().take();
				//开启线程进行切块的操作
				Global.getFile2blockservice().execute(new File2BlockRunner(f));
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

}
