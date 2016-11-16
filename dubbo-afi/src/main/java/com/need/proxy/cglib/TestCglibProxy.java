package com.need.proxy.cglib;

import com.need.proxy.demo.RealSubject;

/**
 * <p>TODO</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author afi on on 2016/11/16.
 * @version 1.0
 * @since 1.0
 */
public class TestCglibProxy {

    public static void main(String args[]){
        CglibProxy proxy = new CglibProxy();

        //动态生成子类的方法创建代理类
        RealSubject fsi =
                (RealSubject)proxy.getProxy(RealSubject.class);

        fsi.SayHello("12321");
    }
}
