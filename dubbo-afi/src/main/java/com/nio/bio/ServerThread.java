package com.nio.bio;

import java.net.Socket;

/**
 * <p>TODO</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author afi on on 2017/4/10.
 * @version 1.0
 * @since 1.0
 */
public class ServerThread implements Runnable{
    private Socket s = null;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println("�������߳�"+Thread.currentThread().getName()+"����ͻ������󡣡���");
        while(true){}
    }
}
