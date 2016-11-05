package com.need.pattern.decorator;

/**
 * <p>TODO</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author afi on on 2016/10/24.
 * @version 1.0
 * @since 1.0
 */
public class Client {

    public static void main(String args[]) {
        Project employe = new Employe();        //代码工人
        Project managerA = new ManagerA(employe); //项目经理
        Project managerB = new ManagerB(managerA); //项目经理
        //以经理的名义将编码完成，功劳都是经理的，实际编码的是工人
        managerB.doCoding();
    }

}
