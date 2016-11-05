package com.need.pattern.strategy;

/**
 * <p>
 *
 *     首先定义一个策略接口，这是诸葛亮老人家给赵云的三个锦囊妙计的接口。
 * </p>
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
public interface IStrategy {

    //每个锦囊妙计都是一个可执行的算法。
    public void operate();
}
