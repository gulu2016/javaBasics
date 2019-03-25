package HeadFirstDesignPatterns.AdapterPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AdapterPattern
 * @ClassName: TurkeyAdapter
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-25 下午2:12
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-25 下午2:12
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0;i < 5;i++){
            turkey.fly();
        }
    }
}
