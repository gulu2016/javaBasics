package HeadFirstDesignPatterns.DecoratePattern;

import HeadFirstDesignPatterns.DecoratePattern.ConcreteBeverage.Espresso;
import HeadFirstDesignPatterns.DecoratePattern.ConcreteBeverage.HouseBlend;
import HeadFirstDesignPatterns.DecoratePattern.ConcreteDecorator.Mocha;
import HeadFirstDesignPatterns.DecoratePattern.ConcreteDecorator.Soy;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.DecoratePattern
 * @ClassName: StarbuzzCoffee
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-21 下午7:42
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-21 下午7:42
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());
    }
}
