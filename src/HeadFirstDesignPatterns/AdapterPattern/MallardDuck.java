package HeadFirstDesignPatterns.AdapterPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AdapterPattern
 * @ClassName: MallardDuck
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-25 下午2:09
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-25 下午2:09
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
