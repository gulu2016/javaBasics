package HeadFirstDesignPatterns.StrategyPattern.TestImplementedDucks;

import HeadFirstDesignPatterns.StrategyPattern.Duck;
import HeadFirstDesignPatterns.StrategyPattern.FlyBehaviors.FlyRocketPowered;
import HeadFirstDesignPatterns.StrategyPattern.ImplementedDucks.MallardDuck;
import HeadFirstDesignPatterns.StrategyPattern.ImplementedDucks.ModelDuck;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StrategyPattern.TestImplementedDucks
 * @ClassName: MiniDuckSimulator
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-19 下午9:13
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-19 下午9:13
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        //验证MallardDuck初始化的行为是否可行
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        //验证ModelDuck的行为是否可以动态改变
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
