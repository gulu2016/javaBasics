package HeadFirstDesignPatterns.IteratorPattern;

import HeadFirstDesignPatterns.ObserverPattern.implementWithJavaUtil.WeatherData;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.IteratorPattern
 * @ClassName: Waitress
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-27 上午11:12
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-27 上午11:12
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;
    Iterator pancakeIterator;
    Iterator dinerIterator;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        pancakeIterator = pancakeHouseMenu.createIterator();
        dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    public void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName()+",");
            System.out.println(menuItem.getPrice()+"--");
            System.out.println(menuItem.getDescription());
        }
    }
}
