package HeadFirstDesignPatterns.FactoryPattern.stores;



import HeadFirstDesignPatterns.FactoryPattern.NYPizzas.NYPizzaVeggiePizza;
import HeadFirstDesignPatterns.FactoryPattern.NYPizzas.NYStuleCheesePizza;
import HeadFirstDesignPatterns.FactoryPattern.NYPizzas.NYStyleClamPizza;
import HeadFirstDesignPatterns.FactoryPattern.NYPizzas.NYStylePepperoniPizza;
import HeadFirstDesignPatterns.FactoryPattern.Pizza;
import HeadFirstDesignPatterns.FactoryPattern.PizzaStore;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.FactoryPattern
 * @ClassName: NYPizzaStore
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-22 下午7:39
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-22 下午7:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStuleCheesePizza();
        }else if(type.equals("veggie")){
            return new NYPizzaVeggiePizza();
        }else if(type.equals("clam")){
            return new NYStyleClamPizza();
        }else if(type.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }return null;
    }
}
