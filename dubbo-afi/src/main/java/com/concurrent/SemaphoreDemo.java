package com.concurrent;

import java.util.concurrent.Semaphore;

/**
 * <p>
 *     信号量
 *      可以控制一段代码 被指定的代码线程数执行
 * </p>
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
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(10,true);

        for(int i=1;i<Integer.MAX_VALUE;i++){
            new Thread(new T11(semaphore,i)).start();
        }

    }
}

class T11 implements Runnable{
    private Semaphore semaphore = null;
    private int i;

    public T11(Semaphore semaphore,int i) {
        this.semaphore = semaphore;
        this.i = i;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("游客"+i+"得到了票，开始游览中南海。。。");
            Thread.sleep(i*1000);
            semaphore.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}