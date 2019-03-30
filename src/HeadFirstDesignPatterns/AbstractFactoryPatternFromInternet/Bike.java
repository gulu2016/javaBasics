package HeadFirstDesignPatterns.AbstractFactoryPatternFromInternet;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AbstractFactoryPatternFromInternet
 * @ClassName: Bike
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-30 下午2:05
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-30 下午2:05
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Bike implements Car {
    @Override
    public void gotowork() {
        System.out.println("骑自行车去上班！");
    }

}
