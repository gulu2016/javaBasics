package HeadFirstDesignPatterns.DecoratePattern.ConcreteDecorator;

import HeadFirstDesignPatterns.DecoratePattern.Beverage;
import HeadFirstDesignPatterns.DecoratePattern.CondimentDecorator;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.DecoratePattern
 * @ClassName: Soy
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-21 下午7:39
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-21 下午7:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }

    @Override
    public double cost() {
        return 0.15+beverage.cost();
    }
}
