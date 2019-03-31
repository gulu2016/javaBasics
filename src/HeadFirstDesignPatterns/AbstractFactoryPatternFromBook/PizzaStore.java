package HeadFirstDesignPatterns.AbstractFactoryPatternFromBook;


import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.AbstractPizza.Pizza;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.FactoryPattern
 * @ClassName: PizzaStore
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-22 下午7:36
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-22 下午7:36
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
