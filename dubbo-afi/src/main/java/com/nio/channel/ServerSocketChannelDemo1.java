package com.nio.channel;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChannelDemo1 {


	public static void main(String[] args) throws Exception {
		//新建一个服务器的 通道
		ServerSocketChannel ssc = ServerSocketChannel.open();
		ssc.configureBlocking(false);
		//注册端口
		ServerSocket ss = ssc.socket();
		ss.bind(new InetSocketAddress(9999));
		
		//处理通道
		SocketChannel sc = null;
		
		while((sc = ssc.accept())==null){
		}
		
		//处理数据信息
		ByteBuffer buf = ByteBuffer.allocate(1024);
		int len = -1;
		while((len = sc.read(buf))!=-1){
		}
		buf.flip();
		byte [] bs = new byte[buf.remaining()];
		buf.get(bs);
		
		System.out.println(new String(bs)); 
		
		sc.close();
		ssc.close();
	}
}
