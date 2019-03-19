package HeadFirstDesignPatterns.StrategyPattern.QuackBehaviors;

import HeadFirstDesignPatterns.StrategyPattern.QuackBehavior;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StrategyPattern
 * @ClassName: Squeak
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-19 下午9:04
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-19 下午9:04
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
