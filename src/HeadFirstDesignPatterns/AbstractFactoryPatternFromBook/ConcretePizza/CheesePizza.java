package HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcretePizza;

import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.AbstractPizza.Pizza;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.AbstractPizzaFactory.PizzaIngredientFactory;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AbstractFactoryPattern.ConcretePizza
 * @ClassName: CheesePizza
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-23 下午3:20
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-23 下午3:20
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
