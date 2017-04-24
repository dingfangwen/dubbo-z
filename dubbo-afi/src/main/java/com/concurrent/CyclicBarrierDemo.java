package com.concurrent;

import java.util.concurrent.CyclicBarrier;

/**
 * <p>栅栏,统一线程的执行点</p>
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
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3);

        new Thread(new T6(cb)).start();
        new Thread(new T7(cb)).start();
        new Thread(new T8(cb)).start();
    }
}

class T8 implements Runnable{
    private CyclicBarrier cb = null;

    public T8(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("T8到达了栅栏。。开始等待。。");
            cb.await();
            System.out.println("T8被释放了。。接着执行。。。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class T7 implements Runnable{
    private CyclicBarrier cb = null;

    public T7(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("T7到达了栅栏。。开始等待。。");
            cb.await();
            System.out.println("T7被释放了。。接着执行。。。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class T6 implements Runnable{
    private CyclicBarrier cb = null;

    public T6(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("T6到达了栅栏。。开始等待。。");
            cb.await();
            System.out.println("T6被释放了。。接着执行。。。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}