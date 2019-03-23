package HeadFirstDesignPatterns.AbstractFactoryPattern.ConcreteFactory;

import HeadFirstDesignPatterns.AbstractFactoryPattern.ConcreteMaterial.FreshClams;
import HeadFirstDesignPatterns.AbstractFactoryPattern.ConcreteMaterial.MarinaraSauce;
import HeadFirstDesignPatterns.AbstractFactoryPattern.ConcreteMaterial.ReggianoCheese;
import HeadFirstDesignPatterns.AbstractFactoryPattern.ConcreteMaterial.ThinCrustDough;
import HeadFirstDesignPatterns.AbstractFactoryPattern.AbstractPizzaFactory.PizzaIngredientFactory;
import HeadFirstDesignPatterns.AbstractFactoryPattern.Abstractaterial.Cheese;
import HeadFirstDesignPatterns.AbstractFactoryPattern.Abstractaterial.Clams;
import HeadFirstDesignPatterns.AbstractFactoryPattern.Abstractaterial.Dough;
import HeadFirstDesignPatterns.AbstractFactoryPattern.Abstractaterial.Sauce;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AbstractFactoryPattern.ConcreteFactory
 * @ClassName: NYPizzaIngredientFactory
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-23 下午3:09
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-23 下午3:09
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
