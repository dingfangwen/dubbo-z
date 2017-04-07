package com.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
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
 * @author afi on on 2017/4/6.
 * @version 1.0
 * @since 1.0
 */
public class SocketChannelDemo {

    public static void main(String[] args) throws Exception{
        SocketChannel sc = SocketChannel.open();
        sc.configureBlocking(false);
        sc.connect(new InetSocketAddress("127.0.0.1",9999));
        while (!sc.finishConnect()){

        }
        String str  = "ssdadadsa";

        ByteBuffer buffer = ByteBuffer.wrap(str.getBytes());
        buffer.flip();
        while (buffer.hasRemaining()){
            sc.write(buffer);
        }

        System.out.println("aadasd");
    }
}
