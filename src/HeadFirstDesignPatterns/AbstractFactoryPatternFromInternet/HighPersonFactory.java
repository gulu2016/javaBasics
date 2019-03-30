package HeadFirstDesignPatterns.AbstractFactoryPatternFromInternet;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AbstractFactoryPatternFromInternet
 * @ClassName: HighPersonFactory
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-30 下午2:09
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-30 下午2:09
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class HighPersonFactory implements IAbstractFactory {

    @Override
    public Car getCar() {
        return new Bus();
    }

    @Override
    public IBreakFast getBreakFast() {
        return new Milk();
    }
}
