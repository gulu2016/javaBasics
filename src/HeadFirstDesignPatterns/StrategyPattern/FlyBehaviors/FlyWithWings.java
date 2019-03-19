package HeadFirstDesignPatterns.StrategyPattern.FlyBehaviors;

import HeadFirstDesignPatterns.StrategyPattern.FlyBehavior;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StrategyPattern
 * @ClassName: FlyWithWings
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-19 下午9:00
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-19 下午9:00
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'am flying!!");
    }
}
