package HeadFirstDesignPatterns.FactoryPattern.stores;


import HeadFirstDesignPatterns.FactoryPattern.ChicagoStylePizza.ChicagoStyleCheesePizza;
import HeadFirstDesignPatterns.FactoryPattern.ChicagoStylePizza.ChicagoStyleCheesePizza1;
import HeadFirstDesignPatterns.FactoryPattern.ChicagoStylePizza.ChicagoStyleCheesePizza2;
import HeadFirstDesignPatterns.FactoryPattern.ChicagoStylePizza.ChicagoStyleCheesePizza3;
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
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(type.equals("cheese1")){
            return new ChicagoStyleCheesePizza1();
        }else if(type.equals("cheese2")){
            return new ChicagoStyleCheesePizza2();
        }else if(type.equals("cheese3")){
            return new ChicagoStyleCheesePizza3();
        }return null;
    }
}
