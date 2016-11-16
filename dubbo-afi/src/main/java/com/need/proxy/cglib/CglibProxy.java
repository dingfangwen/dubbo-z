package com.need.proxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

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
public class CglibProxy implements MethodInterceptor{
    private Enhancer enhancer = new Enhancer();

    //覆盖MethodInterceptor接口的getProxy()方法，设置
    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz); //设者要创建子类的类
        enhancer.setCallback(this); //设置回调的对象
        return enhancer.create(); //通过字节码技术动态创建子类实例,
    }

    public Object intercept(Object obj,Method method,Object[] args,
                            MethodProxy proxy) throws Throwable {
        System.out.println("模拟代理增强方法");

        //通过代理类实例调用父类的方法，即是目标业务类方法的调用
        Object result = proxy.invokeSuper(obj, args);

        System.out.println("模拟代理增强方法结束");
        return result;
    }
}
