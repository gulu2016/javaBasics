package HeadFirstDesignPatterns.FactoryPattern.NYPizzas;

import HeadFirstDesignPatterns.FactoryPattern.Pizza;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.FactoryPattern.NYPizzas
 * @ClassName: NYStyleClamPizza
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-22 下午7:44
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-22 下午7:44
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza(){
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Clam");
    }
}
