package HeadFirstDesignPatterns.IteratorPattern;

import java.util.ArrayList;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.IteratorPattern
 * @ClassName: PancakeHouseMenu
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-27 上午11:02
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-27 上午11:02
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList();

        addItem("PHname1","PHdescription1",true,1.89);
        addItem("PHname2","PHdescription2",true,1.99);
        addItem("PHname3","PHdescription3",false,2.09);
        addItem("PHname4","PHdescription4",false,2.19);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator(){
        return new PancakeMenuIterator(menuItems);
    }
}
