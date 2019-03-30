package HeadFirstDesignPatterns.SimpleFactoryPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.SimpleFactoryPattern
 * @ClassName: SimpleFactoryWithReflex
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-30 上午10:37
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-30 上午10:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SimpleFactoryWithReflex {
    public static Human makeHuman(Class c){
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            System.out.println("不支持抽象类或接口");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("没有足够权限，即不能访问私有对象");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("类不存在");
            e.printStackTrace();
        }
        return human;
    }
}
