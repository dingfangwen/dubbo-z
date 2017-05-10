package com.zebra.file;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import com.zebra.Global;
import org.apache.log4j.Logger;


/**
 * 文件切块线程逻辑
 * @author park
 *
 */
public class File2BlockRunner implements Runnable {
	private Logger logger = Logger.getLogger(File2BlockRunner.class);

	private File f = null;

	public File2BlockRunner(File f) {
		this.f  = f;
	}

	@Override
	public void run() {
		try {
			ByteBuffer buf = ByteBuffer.allocate(Global.getBlocksize());

			FileInputStream fin = new FileInputStream(f);
			FileChannel channel = fin.getChannel();
			//读取文件进行切块，注意边界的处理，不能出现断行
			//从文件中读取块指定大小的数据
			while((channel.read(buf))!=-1){
				//处理边界文件，从buf的最后开始向前找最近的“\r\n”,进行切割，之前的做为一块，剩余的留到下一块作为开头
				buf.flip();

				int keyPosition = -1;
				for(int i=buf.limit()-1;;i--){
					if('\n' == (char)buf.get(i)){
						keyPosition = i+1;
						break;
					}
				}

				byte block [] = new byte[keyPosition];
				buf.get(block);

				byte temp [] = new byte[buf.limit() - keyPosition];
				buf.get(temp);

				Global.getBlock2lineservice().execute(new Block2LineRunner(f,block));

				buf.clear();

				buf.put(temp);
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

}
