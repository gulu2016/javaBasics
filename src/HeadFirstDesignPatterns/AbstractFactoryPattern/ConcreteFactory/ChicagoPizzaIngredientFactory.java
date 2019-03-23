package HeadFirstDesignPatterns.AbstractFactoryPattern.ConcreteFactory;

import HeadFirstDesignPatterns.AbstractFactoryPattern.ConcreteMaterial.FrozeClams;
import HeadFirstDesignPatterns.AbstractFactoryPattern.ConcreteMaterial.MozzarellaCheese;
import HeadFirstDesignPatterns.AbstractFactoryPattern.ConcreteMaterial.PlumTomatoSauce;
import HeadFirstDesignPatterns.AbstractFactoryPattern.ConcreteMaterial.ThickCrustDough;
import HeadFirstDesignPatterns.AbstractFactoryPattern.AbstractPizzaFactory.PizzaIngredientFactory;
import HeadFirstDesignPatterns.AbstractFactoryPattern.Abstractaterial.Cheese;
import HeadFirstDesignPatterns.AbstractFactoryPattern.Abstractaterial.Clams;
import HeadFirstDesignPatterns.AbstractFactoryPattern.Abstractaterial.Dough;
import HeadFirstDesignPatterns.AbstractFactoryPattern.Abstractaterial.Sauce;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AbstractFactoryPattern.ConcreteFactory
 * @ClassName: ChicagoPizzaIngredientFactory
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-23 下午3:11
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-23 下午3:11
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClam() {
        return new FrozeClams();
    }
}
