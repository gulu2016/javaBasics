package HeadFirstDesignPatterns.FacadePattern;

import HeadFirstDesignPatterns.FacadePattern.SomeObjects.Object1;
import HeadFirstDesignPatterns.FacadePattern.SomeObjects.Object2;
import HeadFirstDesignPatterns.FacadePattern.SomeObjects.Object3;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.FacadePattern
 * @ClassName: HomeTheaterFacade
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-25 下午2:46
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-25 下午2:46
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class HomeTheaterFacade {
    Object1 o1;
    Object2 o2;
    Object3 o3;

    public HomeTheaterFacade(Object1 o1, Object2 o2, Object3 o3) {
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
    }

    public void watchMovie(){
        o1.on();
        o2.on();
        o3.on();
    }

    public void endMovie(){
        o1.off();
        o2.off();
        o3.off();
    }
}
