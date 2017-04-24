package com.concurrent;

import java.util.concurrent.*;

/**
 * <p>TODO</p>
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
public class ThreadpoolDemo {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService service = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new ArrayBlockingQueue(5), new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println("线程池实在忙不过来了，多出来的线程就拒绝吧！"+r);
            }
        });

        //向线程池中提交任务
        for(int i =1 ;i<=16;i++){
            service.execute(new T12(i));
        }

    }
}

class T12 implements Runnable{
    private int id = 0;
    public T12(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("线程"+id+"被创建出来了！");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}