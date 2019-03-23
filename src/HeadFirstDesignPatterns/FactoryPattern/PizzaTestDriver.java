package HeadFirstDesignPatterns.FactoryPattern;

import HeadFirstDesignPatterns.FactoryPattern.stores.ChicagoPizzaStore;
import HeadFirstDesignPatterns.FactoryPattern.stores.NYPizzaStore;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.FactoryPattern
 * @ClassName: PizzaTestDriver
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-22 下午8:12
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-22 下午8:12
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class PizzaTestDriver {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName()+"\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName()+"\n");
    }
}
