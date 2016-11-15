package com.need.proxy.jdk;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p>TODO</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author afi on on 2016/11/5.
 * @version 1.0
 * @since 1.0
 */
public class ProxyTest {

    @Test
    public void testProxy() throws Throwable {
        // 实例化目标对象
        UserService userService = new UserServiceImpl();

        // 实例化InvocationHandler
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);

        // 根据目标对象生成代理对象
        UserService proxy = (UserService) invocationHandler.getProxy();

        // 调用代理对象的方法
        proxy.add();

    }


    @Test
    public void testProxy1() throws Throwable {
        //生成$Proxy0的class文件
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //获取动态代理类
        Class proxyClazz = Proxy.getProxyClass(UserService.class.getClassLoader(),UserService.class);
        //获得代理类的构造函数，并传入参数类型InvocationHandler.class
        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
        //通过构造函数来创建动态代理对象，将自定义的InvocationHandler实例传入
        UserService userService = (UserService) constructor.newInstance(new MyInvocationHandler(new UserServiceImpl()));
        //通过代理对象调用目标方法
        userService.add();
    }

    @Test
    public void testProxy2() throws Throwable {
        //生成$Proxy0的class文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        UserService  userService = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(),  //加载接口的类加载器
                new Class[]{UserService.class},      //一组接口
                new MyInvocationHandler(new UserServiceImpl())); //自定义的InvocationHandler
        userService.add();
    }

}
