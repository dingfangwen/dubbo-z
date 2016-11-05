package com.need.pattern.strategy;

/**
 * <p>TODO</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author afi on on 2016/10/25.
 * @version 1.0
 * @since 1.0
 */
public class Client {
    /**
     * 赵云出场了，他根据诸葛亮给他的交代，依次拆开妙计
     */
    public static void main(String[] args) {
        Context context;

        //刚到吴国的时候拆开第一个
        System.out.println("----------刚刚到吴国的时候拆开第一个---------------");
        context = new Context(new BackDoor());
        context.operate();//拆开执行

        //当刘备乐不思蜀时，拆开第二个
        System.out.println("----------刘备乐不思蜀，拆第二个了---------------");
        context = new Context(new GivenGreenLight());
        context.operate();//拆开执行

        //孙权的小追兵了，咋办？拆开第三个锦囊
        System.out.println("----------孙权的小追兵了，咋办？拆开第三个锦囊---------------");
        context = new Context(new BlackEnemy());
        context.operate();//拆开执行
    }


}
