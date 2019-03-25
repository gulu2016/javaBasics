package HeadFirstDesignPatterns.AdapterPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AdapterPattern
 * @ClassName: WildTurkey
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-25 下午2:11
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-25 下午2:11
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
