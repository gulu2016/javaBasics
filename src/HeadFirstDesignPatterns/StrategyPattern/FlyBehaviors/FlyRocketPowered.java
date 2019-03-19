package HeadFirstDesignPatterns.StrategyPattern.FlyBehaviors;

import HeadFirstDesignPatterns.StrategyPattern.FlyBehavior;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StrategyPattern.FlyBehaviors
 * @ClassName: FlyRocketPowered
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-19 下午9:26
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-19 下午9:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
