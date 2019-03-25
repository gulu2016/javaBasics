package HeadFirstDesignPatterns.FacadePattern;

import HeadFirstDesignPatterns.FacadePattern.SomeObjects.Object1;
import HeadFirstDesignPatterns.FacadePattern.SomeObjects.Object2;
import HeadFirstDesignPatterns.FacadePattern.SomeObjects.Object3;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.FacadePattern
 * @ClassName: HomeTheaterTestDriver
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-25 下午2:51
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-25 下午2:51
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 *
 * 外观模式测试程序
 */
public class HomeTheaterTestDriver {
    public static void main(String[] args){
        Object1 object1 = new Object1();
        Object2 object2 = new Object2();
        Object3 object3 = new Object3();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(object1,object2,object3);

        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
