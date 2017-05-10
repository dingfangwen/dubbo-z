package com.zebra.net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.zebra.domain.Engin2Info;
import org.apache.log4j.Logger;


public class NIOClient implements Runnable{
	private static Logger logger = Logger.getLogger(NIOClient.class);
	private static Selector selc = null;
	private static Map<Engin2Info,SocketChannel> channelMap = null;

	static{
		try {
			channelMap = new HashMap<Engin2Info, SocketChannel>();
			selc = Selector.open();
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

	public static void sendData(Engin2Info e2info){
		try {
			if(channelMap.containsKey(e2info)){
				//之前已经创建过到此远程主机的通道，可以复用
				SocketChannel sc = channelMap.get(e2info);
				sc.register(selc, SelectionKey.OP_WRITE,e2info);
			}else{
				//之前没有创建过到此远程主机的通道，需要新建
				SocketChannel sc = SocketChannel.open();
				sc.configureBlocking(false);
				sc.connect(new InetSocketAddress(e2info.getIp(), e2info.getPort()));
				sc.register(selc, SelectionKey.OP_CONNECT | SelectionKey.OP_WRITE ,e2info);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

	@Override
	public void run() {
		try {
			while(true){
				selc.select(1 * 1000);
				Set<SelectionKey> set = selc.selectedKeys();
				Iterator<SelectionKey> it = set.iterator();
				while(it.hasNext()){
					SelectionKey key = it.next();

					if(key.isConnectable()){
						//完成连接
						SocketChannel sc = (SocketChannel) key.channel();
						while(!sc.finishConnect()){}
						//保存到map中为了可以复用
						Engin2Info e2info = (Engin2Info) key.attachment();
						channelMap.put(e2info, sc);
						logger.info("创建了连接到远程主机的通道："+e2info.getIp()+":"+e2info.getPort());
						//清除注册操作
						sc.register(selc, key.interestOps() & (~SelectionKey.OP_CONNECT),e2info);
					}

					if(key.isWritable()){
						SocketChannel sc = (SocketChannel) key.channel();
						Engin2Info e2info = (Engin2Info) key.attachment();

						byte [] body = null;
						while((body = e2info.getDataQueue().poll())!=null){
							ByteBuffer head_buf = ByteBuffer.wrap((body.length+"\r\n").getBytes());
							ByteBuffer body_buf = ByteBuffer.wrap(body);
							while(body_buf.hasRemaining()){
								sc.write(new ByteBuffer[]{head_buf,body_buf});
							}
							logger.info("向远程主机["+e2info.getIp()+"#"+e2info.getPort()+"]发送的了数据:"+body.length+"字节。。");
						}
						sc.register(selc, key.interestOps() & (~SelectionKey.OP_WRITE));
					}
					it.remove();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}
}
