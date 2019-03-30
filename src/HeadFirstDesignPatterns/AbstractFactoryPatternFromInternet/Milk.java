package HeadFirstDesignPatterns.AbstractFactoryPatternFromInternet;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AbstractFactoryPatternFromInternet
 * @ClassName: Milk
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-30 下午2:06
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-30 下午2:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Milk implements IBreakFast {

    @Override
    public void eat() {
        System.out.println("喝牛奶！");
    }

}
