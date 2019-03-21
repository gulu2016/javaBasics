package HeadFirstDesignPatterns.DecoratePattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.DecoratePattern
 * @ClassName: Beverage
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-21 下午7:31
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-21 下午7:31
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
