package HeadFirstDesignPatterns.StrategyPattern.FlyBehaviors;

import HeadFirstDesignPatterns.StrategyPattern.FlyBehavior;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StrategyPattern
 * @ClassName: FlyNoWay
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-19 下午9:01
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-19 下午9:01
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
