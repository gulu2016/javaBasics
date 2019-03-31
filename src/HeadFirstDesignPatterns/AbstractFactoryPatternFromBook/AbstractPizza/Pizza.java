package HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.AbstractPizza;

import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Cheese;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Clams;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Dough;
import HeadFirstDesignPatterns.AbstractFactoryPatternFromBook.Abstractaterial.Sauce;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AbstractFactoryPattern
 * @ClassName: Pizza
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-23 下午3:15
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-23 下午3:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Clams clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", clams=" + clams +
                '}';
    }
}
