package HeadFirstDesignPatterns.FactoryPattern.NYPizzas;

import HeadFirstDesignPatterns.FactoryPattern.Pizza;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.FactoryPattern
 * @ClassName: NYStuleCheesePizza
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-22 下午7:31
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-22 下午7:31
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class NYStuleCheesePizza extends Pizza {
    public NYStuleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
