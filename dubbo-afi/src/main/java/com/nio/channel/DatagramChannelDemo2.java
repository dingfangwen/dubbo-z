package com.nio.channel;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannelDemo2 {
	public static void main(String[] args) throws Exception {
		DatagramChannel dc = DatagramChannel.open();
		dc.socket().bind(new InetSocketAddress(8899));
		ByteBuffer buf = ByteBuffer.allocate(1024);
		dc.receive(buf);
		
		buf.flip();
		while(buf.hasRemaining()){
			System.out.println((char)buf.get());
		}
		
	}
}
