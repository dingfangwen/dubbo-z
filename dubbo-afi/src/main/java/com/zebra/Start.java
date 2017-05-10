package com.zebra;

import com.zebra.exec.Exec;
import com.zebra.file.File2BlockExec;
import com.zebra.file.FileCollector;
import com.zebra.net.NIOClient;
import org.apache.log4j.Logger;


public class Start {
	private static Logger logger = Logger.getLogger(Start.class);
	public static void main(String[] args) {
		logger.info("一级引擎开始启动");
		//初始化
		Global.init();
		
		//启动网络模块
		new Thread(new NIOClient()).start();
		//扫描文件
		new Thread(new FileCollector()).start();
		//�����ļ��п�
		new Thread(new File2BlockExec()).start();
		
		//����Exec
		new Thread(new Exec()).start();
	}
}
