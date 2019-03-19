package JVM.unit7;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @ProjectName: leetCodePro
 * @Package: JVM.unit7
 * @ClassName: NotInitialization
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-19 上午11:25
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-19 上午11:25
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 *
 */

//超类
class SuperClass{
    static {
        System.out.println("superclass init");
    }
    public static int value = 123;
}
class SubClass extends SuperClass {
    static {
        System.out.println("subclass init!");
    }
}
class ConstClass{
    static {
        System.out.println("ConstClass init!");
    }
    public static final String HELLOWORLD = "hello world";
}
public class NotInitialization {
    public static void main(String[] args){
        //对于静态字段，只有直接定义该字段才会被初始化，
        //因此此处会调用父类的静态字段而不会调用子类的静态字段
        System.out.println(SubClass.value);
        //类的final成员在初始化的时候进入常量池，所以此时索引不会触发类的初始化
        System.out.println(ConstClass.HELLOWORLD);
    }
}
