package HeadFirstDesignPatterns.AbstractFactoryPatternFromInternet;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AbstractFactoryPatternFromInternet
 * @ClassName: AbstractFactoryTest
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-30 下午2:10
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-30 下午2:10
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 *
 * 参考博客地址：https://www.cnblogs.com/lilin0719/p/5313886.html
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        IAbstractFactory factory = new LowPersonFactory();
        Car car = factory.getCar();
        IBreakFast breakFast = factory.getBreakFast();
        System.out.println("吃的早饭是：");
        breakFast.eat();
        System.out.println("上班交通工具是：");
        car.gotowork();

        IAbstractFactory factory2 = new HighPersonFactory();
        car = factory2.getCar();
        breakFast = factory2.getBreakFast();
        System.out.println("吃的早饭是：");
        breakFast.eat();
        System.out.println("上班交通工具是：");
        car.gotowork();
    }

}
