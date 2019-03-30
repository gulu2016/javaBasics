package HeadFirstDesignPatterns.SimpleFactoryPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.SimpleFactoryPattern
 * @ClassName: Woman
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-30 上午10:34
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-30 上午10:34
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Woman implements Human {

    /* say method
     * @see com.roc.factory.Human#say()
     */
    @Override
    public void say() {
        System.out.println("女人");
    }

}
