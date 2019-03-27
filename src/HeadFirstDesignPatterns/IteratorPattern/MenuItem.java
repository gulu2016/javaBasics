package HeadFirstDesignPatterns.IteratorPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.IteratorPattern
 * @ClassName: MenuItem
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-27 上午10:45
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-27 上午10:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
