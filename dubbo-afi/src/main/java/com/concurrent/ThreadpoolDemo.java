package com.concurrent;

import java.util.concurrent.*;

/**
 * <p>线程池</p>
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

    public static void main(String[] args)throws Exception {


        ExecutorService service = Executors.newCachedThreadPool();
//		service.execute(command);

//		Future future = service.submit(new T13());
//		Object obj = future.get();
//		System.out.println(obj);

        Future<String> future = service.submit(new T14());
        String retStr = future.get();
        System.out.println(retStr);
        service.shutdown();
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


class T14 implements Callable<String>{

    @Override
    public String call() throws Exception {
        try {
            System.out.println("T14开始执行。。。。");
            Thread.sleep(5000);
            System.out.println("T14执行结束。。。。");

            return "return from t14~~~~";

        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}

class T13 implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("T13开始执行。。。。");
            Thread.sleep(5000);
            System.out.println("T13执行结束。。。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}