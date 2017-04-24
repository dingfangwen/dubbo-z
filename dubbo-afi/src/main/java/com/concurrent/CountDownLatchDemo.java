package com.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * <p>多线程的 处理</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author afi on on 2017/4/24.
 * @version 1.0
 * @since 1.0
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws Exception {
        CountDownLatch cdl = new CountDownLatch(3);

        new Thread(new T3(cdl)).start();
        new Thread(new T4(cdl)).start();
        new Thread(new T5(cdl)).start();

        //await方法将会产生阻塞，知道cdl中的数字被递减为0才会释放阻塞
        cdl.await();

        System.out.println("开始做饭。。。");
    }
}

/**
 * 买菜
 */
class T5 implements Runnable{
    private CountDownLatch cdl = null;
    public T5(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("T5买锅回来了。。。。");
            cdl.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/**
 * 买菜
 */
class T4 implements Runnable{
    private CountDownLatch cdl = null;
    public T4(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("T4买米回来了。。。。");
            cdl.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/**
 * 买菜
 */
class T3 implements Runnable{
    private CountDownLatch cdl = null;
    public T3(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("T3买菜回来了。。。。");
            cdl.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
