package com.nio.channel;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SockeChannelDemo1 {
	public static void main(String[] args) throws Exception {
		SocketChannel sc = SocketChannel.open();
		sc.configureBlocking(false);
		sc.connect(new InetSocketAddress("127.0.0.1", 9999));
		
		while(!sc.finishConnect()){
		}
		
		String str = "hello nio!";
		ByteBuffer buf = ByteBuffer.wrap(str.getBytes());
		while(buf.hasRemaining()){
			sc.write(buf);
		}
		
		sc.close();
	}
}
