package com.nio.channel;

import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo1 {
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("3.txt", "rwd");
		//FileOutputStream out = new FileOutputStream("3.txt");
		FileChannel fc = raf.getChannel();
		
		fc.position(3);
		ByteBuffer buf = ByteBuffer.wrap("t".getBytes());
		fc.write(buf);
		
		fc.close();
		raf.close();
		
	}
}
