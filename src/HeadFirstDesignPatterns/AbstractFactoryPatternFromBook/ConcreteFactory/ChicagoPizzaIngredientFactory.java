package HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcreteFactory;

import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcreteMaterial.FrozeClams;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcreteMaterial.MozzarellaCheese;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcreteMaterial.PlumTomatoSauce;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcreteMaterial.ThickCrustDough;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.AbstractPizzaFactory.PizzaIngredientFactory;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Cheese;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Clams;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Dough;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Sauce;

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
