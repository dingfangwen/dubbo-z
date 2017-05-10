package com.zebra.file;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStreamReader;

import com.zebra.Global;
import org.apache.log4j.Logger;


/**
 * 将块切成行
 * @author park
 *
 */
public class Block2LineRunner implements Runnable {
	private Logger logger = Logger.getLogger(Block2LineRunner.class);

	private File f = null;
	private byte [] block = null;

	public Block2LineRunner(File f, byte[] block) {
		this.f = f;
		this.block = block;
	}

	@Override
	public void run() {
		try {
			//从文件名中截取出时间片信息
			String time = f.getName().split("_")[1];
			String reportTimeStr = time.substring(0, time.length()-4)+"0000";

			ByteArrayInputStream in = new ByteArrayInputStream(block);
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));

			String line = null;
			int countLine = 0;
			while((line = reader.readLine())!=null){
				//在line之前拼接数据产生的时间片信息
				line = reportTimeStr+"|"+line;
				Global.getLinequeue().put(line);
				countLine++;
				logger.debug(line);
			}
			logger.info("读取到总行数："+countLine);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}

	}

}
