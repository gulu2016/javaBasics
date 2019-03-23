package HeadFirstDesignPatterns.FactoryPattern;

import java.util.ArrayList;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.FactoryPattern
 * @ClassName: Pizza
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-22 下午7:26
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-22 下午7:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Adding toppings: ");
        for(int i = 0;i < toppings.size();i++)
            System.out.println("  "+toppings.get(i));
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Please pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
