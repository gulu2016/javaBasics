package HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.AbstractPizzaFactory;

import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Cheese;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Clams;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Dough;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Sauce;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AbstractFactoryPattern
 * @ClassName: PizzaIngredientFactory
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-23 下午2:56
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-23 下午2:56
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClam();
}
