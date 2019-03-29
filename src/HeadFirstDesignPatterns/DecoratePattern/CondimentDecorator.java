package HeadFirstDesignPatterns.DecoratePattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.DecoratePattern
 * @ClassName: CondimentDecorator
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-21 下午7:35
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-21 下午7:35
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
