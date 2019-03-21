package HeadFirstDesignPatterns.DecoratePattern.ConcreteBeverage;

import HeadFirstDesignPatterns.DecoratePattern.Beverage;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.DecoratePattern
 * @ClassName: HouseBlend
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-21 下午7:34
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-21 下午7:34
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
