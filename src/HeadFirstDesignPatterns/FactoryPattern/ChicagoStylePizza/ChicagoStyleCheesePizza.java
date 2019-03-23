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
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
