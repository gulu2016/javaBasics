package HeadFirstDesignPatterns.DecoratePattern.ConcreteBeverage;

import HeadFirstDesignPatterns.DecoratePattern.Beverage;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.DecoratePattern
 * @ClassName: Espresso
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-21 下午7:33
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-21 下午7:33
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
