package HeadFirstDesignPatterns.SimpleFactoryPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.SimpleFactoryPattern
 * @ClassName: Man
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-30 上午10:33
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-30 上午10:33
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Man implements Human {

    /* say method
     * @see com.roc.factory.Human#say()
     */
    @Override
    public void say() {
        System.out.println("男人");
    }

}
