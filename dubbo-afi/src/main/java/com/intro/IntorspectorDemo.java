package com.intro;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * <p>TODO</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author afi on on 2017/5/4.
 * @version 1.0
 * @since 1.0
 */
public class IntorspectorDemo {
    public static void main(String[] args) throws Exception {
		//获取指定javabean类的bean信息
		BeanInfo bi = Introspector.getBeanInfo(Person.class);
		//获取属性描述器
		PropertyDescriptor[] pds = bi.getPropertyDescriptors();
		//遍历属性描述
		for(PropertyDescriptor pd : pds){
			System.out.println(pd.getName());
		}
        Person p = new Person();
        p.setName("zhangfei");
        p.setAge(19);

        PropertyDescriptor pd = new PropertyDescriptor("name", Person.class);

        //获取属性名
        String pname = pd.getName();
        System.out.println(pname);

        //获取getXxx方法
        Method rm = pd.getReadMethod();
        String name = (String) rm.invoke(p, null);
        System.out.println(name);

        //获取setXxx方法
        Method wm = pd.getWriteMethod();
        wm.invoke(p, "关羽");
        System.out.println(p.getName());

    }
}
