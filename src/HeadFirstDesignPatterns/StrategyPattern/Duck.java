package HeadFirstDesignPatterns.StrategyPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StrategyPattern
 * @ClassName: Duck
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-19 下午8:57
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-19 下午8:57
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public Duck(){}
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float,even decoys");
    }
}
