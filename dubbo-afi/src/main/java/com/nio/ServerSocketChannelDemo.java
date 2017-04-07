package com.nio;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * <p>TODO</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author afi on on 2017/4/7.
 * @version 1.0
 * @since 1.0
 */
public class ServerSocketChannelDemo {

    /**
     * 非阻塞的 所有的accept 和 read 等都是非阻塞的
     *
     * 非阻塞io
     *
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)  throws Exception{
        //创建
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.configureBlocking(false);
        //获取底层的对象  并监听端口
        ServerSocket ss = ssc.socket();
        ss.bind(new InetSocketAddress(9999));
        //
        SocketChannel sc = null;
        while((sc = ssc.accept()) == null){

        }
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int len = -1;

        while ((len = sc.read(buffer)) != -1){

        }

        buffer.flip();
        byte [] bs = new byte[buffer.remaining()];

        buffer.get(bs);

        System.out.println(1111);
        System.out.println(new String(bs));


        sc.close();
        ssc.close();
        //循环等待操作

        System.out.println(1111);
    }
}
