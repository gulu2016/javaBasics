package HeadFirstDesignPatterns.AbstractFactoryPatternFromInternet;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AbstractFactoryPatternFromInternet
 * @ClassName: IAbstractFactory
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-30 下午2:07
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-30 下午2:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface IAbstractFactory {

    /**
     *
     * @return
     */
    Car getCar();

    /**
     *
     */
    IBreakFast getBreakFast();

}
