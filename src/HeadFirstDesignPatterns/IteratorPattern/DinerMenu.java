package HeadFirstDesignPatterns.IteratorPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.IteratorPattern
 * @ClassName: DinerMenu
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-27 上午10:50
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-27 上午10:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("name1","description1",true,2.99);
        addItem("name2","description2",true,3.09);
        addItem("name3","description3",false,3.19);
        addItem("name4","description4",false,3.29);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        if(numberOfItems >= MAX_ITEMS)
            System.out.println("menu is full");
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
