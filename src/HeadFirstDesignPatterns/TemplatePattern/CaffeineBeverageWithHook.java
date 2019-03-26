package HeadFirstDesignPatterns.TemplatePattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.TemplatePattern
 * @ClassName: CaffeineBeverageWithHook
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-26 下午2:21
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-26 下午2:21
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class CaffeineBeverageWithHook {
    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }

    void prepareRevipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
            addCondiments();
    }
}
