package HeadFirstDesignPatterns.StrategyPattern.ImplementedDucks;

import HeadFirstDesignPatterns.StrategyPattern.Duck;
import HeadFirstDesignPatterns.StrategyPattern.FlyBehaviors.FlyWithWings;
import HeadFirstDesignPatterns.StrategyPattern.QuackBehaviors.Quack;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StrategyPattern.ImplementedDucks
 * @ClassName: MallardDuck
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-19 下午9:09
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-19 下午9:09
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
//MallardDuck类已经验证可可以对接口属性进行赋值，也就是将初始化的时候在决定行为
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
