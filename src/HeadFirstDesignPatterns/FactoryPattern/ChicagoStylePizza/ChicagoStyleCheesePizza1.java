package HeadFirstDesignPatterns.FactoryPattern.ChicagoStylePizza;

import HeadFirstDesignPatterns.FactoryPattern.Pizza;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.FactoryPattern
 * @ClassName: ChicagoStyleCheesePizza
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-22 下午7:33
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-22 下午7:33
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ChicagoStyleCheesePizza1 extends Pizza {
    public ChicagoStyleCheesePizza1(){
        name = "Chicago Style Deep Dish Cheese1 Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese1");
    }
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
