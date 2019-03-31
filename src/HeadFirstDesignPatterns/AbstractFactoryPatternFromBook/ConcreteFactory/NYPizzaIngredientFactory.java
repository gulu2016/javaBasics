package HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcreteFactory;

import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcreteMaterial.FreshClams;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcreteMaterial.MarinaraSauce;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcreteMaterial.ReggianoCheese;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcreteMaterial.ThinCrustDough;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.AbstractPizzaFactory.PizzaIngredientFactory;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Cheese;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Clams;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Dough;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Sauce;

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
