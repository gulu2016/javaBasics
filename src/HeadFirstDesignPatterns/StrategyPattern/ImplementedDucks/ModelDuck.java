package HeadFirstDesignPatterns.StrategyPattern.ImplementedDucks;

import HeadFirstDesignPatterns.StrategyPattern.Duck;
import HeadFirstDesignPatterns.StrategyPattern.FlyBehaviors.FlyNoWay;
import HeadFirstDesignPatterns.StrategyPattern.QuackBehaviors.Quack;
import com.sun.org.apache.xpath.internal.operations.Mod;

import javax.jws.WebParam;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StrategyPattern.ImplementedDucks
 * @ClassName: ModelDuck
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-19 下午9:24
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-19 下午9:24
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
