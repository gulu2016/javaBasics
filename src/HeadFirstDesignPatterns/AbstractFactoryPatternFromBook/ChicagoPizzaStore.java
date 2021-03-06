package HeadFirstDesignPatterns.AbstractFactoryPatternFromBook;

import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.AbstractPizza.Pizza;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.AbstractPizzaFactory.PizzaIngredientFactory;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcreteFactory.ChicagoPizzaIngredientFactory;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcretePizza.CheesePizza;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.ConcretePizza.ClamPizza;



/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AbstractFactoryPattern
 * @ClassName: ChicagoPizzaStore
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-23 下午3:38
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-23 下午3:38
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new
                ChicagoPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}
