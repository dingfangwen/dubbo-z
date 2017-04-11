package com.nio.select;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class SelecSSCDemo1 {
	public static void main(String[] args) throws Exception {
		//1.新建一个选择器
		Selector selc = Selector.open();
	
		//2.创建链接设置为非阻塞
		ServerSocketChannel ssc = ServerSocketChannel.open();
		ssc.configureBlocking(false);
		//3.创建ServerSocket对象 监听端口
		ServerSocket ss = ssc.socket();
		ss.bind(new InetSocketAddress(9999));
		
		//4.注册
		ssc.register(selc, SelectionKey.OP_ACCEPT);
		
		
		while(true){
			//5.选择就绪的通道
			selc.select();
			
			//6.获取已经就绪的key 循环
			Set<SelectionKey> set = selc.selectedKeys();
			Iterator<SelectionKey> it = set.iterator();
			while(it.hasNext()){
				//7.获取便利的建
				SelectionKey sk = it.next();
				
				//8.如果是可连接
				if(sk.isAcceptable()){
					//9.获取对象
					ServerSocketChannel sscx = (ServerSocketChannel) sk.channel();
					SocketChannel sc = sscx.accept();
					sc.configureBlocking(false);
					//10.将SocketChannlel注册到选择器中
					sc.register(selc, SelectionKey.OP_READ);
				}
				
				//8.如果是连接
				if(sk.isReadable()){
					//9.获取当前便利到的 对应的通道,从中读取数据
					SocketChannel sc = (SocketChannel) sk.channel();
					
					String head = "";
					ByteBuffer buf = ByteBuffer.allocate(1);
					while(!head.endsWith("\r\n")){
						sc.read(buf);
						buf.flip();
						head += (char)buf.get();
						buf.clear();
					}
					
					int len = Integer.parseInt(head.substring(0, head.length()-2));
					
					buf = ByteBuffer.allocate(len);
					while(buf.hasRemaining()){
						sc.read(buf);
					}

					String body = new String(buf.array());
					System.out.println("从客户端获取数据:"+body);
				}
				
				//11.移除
				it.remove();
			}
		}
	}

}
