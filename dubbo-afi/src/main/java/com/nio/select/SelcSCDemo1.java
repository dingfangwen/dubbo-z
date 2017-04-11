package com.nio.select;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class SelcSCDemo1 {
	public static void main(String[] args) throws IOException {
		//创建选择器
		Selector selc = Selector.open();
		
		//2.新建通道
		SocketChannel sc = SocketChannel.open();
		sc.configureBlocking(false);
		
		//3.将通道注册到选择器上
		sc.register(selc, SelectionKey.OP_CONNECT);
		//4.通道连接服务
		sc.connect(new InetSocketAddress("127.0.0.1",9999));
		
		while(true){
			//5.选择器 就绪的
			selc.select();
			
			//6.便利当前的所有的选择器
			Set<SelectionKey> set = selc.selectedKeys();
			Iterator<SelectionKey> it = set.iterator();
			while(it.hasNext()){
				//7.获取当前选择器的key
				SelectionKey sk = it.next();
				
				//8.如果是可连接的
				if(sk.isConnectable()){
					//9.完成连接
					SocketChannel scx = (SocketChannel) sk.channel();
					while(!scx.finishConnect()){}
					//10.重新注册write
					scx.register(selc, SelectionKey.OP_WRITE);
				}
				
				//8.注册写
				if(sk.isWritable()){
					//9.获取通道信息 向外写数据
					SocketChannel scx = (SocketChannel) sk.channel();
					byte [] body = "xxxyyy".getBytes();
					byte [] head = (body.length+"\r\n").getBytes();
					
					ByteBuffer head_buf = ByteBuffer.wrap(head);
					ByteBuffer body_buf = ByteBuffer.wrap(body);
					
					while(body_buf.hasRemaining()){
						scx.write(new ByteBuffer[]{head_buf,body_buf});
					}
					//10.为了重复写出,需要已经注册的key中删除 key
					scx.register(selc, sk.interestOps() & ~SelectionKey.OP_WRITE);
				}
			}
			
			//1.移除当前的链接信息
			it.remove();
		}
			
		
	}
}
