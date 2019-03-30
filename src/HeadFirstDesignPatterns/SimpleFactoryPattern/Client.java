package HeadFirstDesignPatterns.SimpleFactoryPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.SimpleFactoryPattern
 * @ClassName: Client
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-30 上午10:35
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-30 上午10:35
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 *
 * 注意，HeadFirst 书上并没有将简单工厂作为一种模式，而是编程习惯，这里参考博客
 * https://www.cnblogs.com/liaoweipeng/p/5768197.html
 * 有两种方式，一种用if-else创建对象，另一种使用反射技术创建对象
 */
public class Client {
    public static void main(String[] args) {

        Human man = SimpleFactory.makeHuman("man");
        man.say();
        Human woman = SimpleFactory.makeHuman("woman");
        woman.say();

        Human manWithReflex = SimpleFactoryWithReflex.makeHuman(Man.class);
        manWithReflex.say();
        Human womanWithReflex = SimpleFactoryWithReflex.makeHuman(Woman.class);
        womanWithReflex.say();
    }
}
