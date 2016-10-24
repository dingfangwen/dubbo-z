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
public class Employe implements Project {

    /**
     * 编码
     */
    public void doCoding(){
        System.out.println("代码工人 在编写代码，加班编啊编啊，终于编完了！");
    }

}
