package HeadFirstDesignPatterns.IteratorPattern;

import HeadFirstDesignPatterns.ObserverPattern.implementWithJavaUtil.WeatherData;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.IteratorPattern
 * @ClassName: MenuTestDriver
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-27 上午11:19
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-27 上午11:19
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MenuTestDriver {
    public static void main(String[] args){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}
