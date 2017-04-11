package com.nio.channel;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannelDemo1 {
	public static void main(String[] args) throws Exception {
		DatagramChannel dc = DatagramChannel.open();
		dc.send(ByteBuffer.wrap("hahaha".getBytes()), new InetSocketAddress("127.0.0.1",8899));
	}
}
