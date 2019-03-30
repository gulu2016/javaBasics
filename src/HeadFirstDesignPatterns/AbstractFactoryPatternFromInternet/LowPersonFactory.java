package HeadFirstDesignPatterns.AbstractFactoryPatternFromInternet;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AbstractFactoryPatternFromInternet
 * @ClassName: LowPersonFactory
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-30 下午2:08
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-30 下午2:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LowPersonFactory implements IAbstractFactory {

    @Override
    public Car getCar() {
        return new Bike();
    }

    @Override
    public IBreakFast getBreakFast() {
        return new Orange();
    }

}
