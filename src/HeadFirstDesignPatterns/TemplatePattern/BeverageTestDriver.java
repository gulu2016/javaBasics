package HeadFirstDesignPatterns.TemplatePattern;

import java.util.Collection;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.TemplatePattern
 * @ClassName: BeverageTestDriver
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-26 下午2:30
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-26 下午2:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class BeverageTestDriver {
    public static void main(String[] args){
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("making tea");
        teaHook.prepareRevipe();

        System.out.println("making coffee");
        coffeeHook.prepareRevipe();
    }
}
