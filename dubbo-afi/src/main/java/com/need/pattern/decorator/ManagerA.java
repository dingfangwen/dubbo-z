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
public class ManagerA extends Manager {

    public ManagerA(Project project) {
        super(project);
    }

    /**
     * 项目经理自己的事情：做早期工作
     */
    public void doEarlyWork() {
        System.out.println("项目经理A 在做需求分析");
        System.out.println("项目经理A 在做架构设计");
        System.out.println("项目经理A 在做详细设计");
    }

}
