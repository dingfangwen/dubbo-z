package com.need.pattern.observer;

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
public class ConcreteWatcher  implements Watcher
{

    @Override
    public void update(String str)
    {
        System.out.println(str);
    }

}
