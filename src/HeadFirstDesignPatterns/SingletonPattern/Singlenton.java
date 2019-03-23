package HeadFirstDesignPatterns.SingletonPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.SingletonPattern
 * @ClassName: Singlenton
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-23 下午4:08
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-23 下午4:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Singlenton {
    private volatile static Singlenton uniqueinstance;
    private Singlenton(){}

    public static Singlenton getInstance(){
        if(uniqueinstance == null){
            synchronized (Singlenton.class){
                if(uniqueinstance == null)
                    uniqueinstance = new Singlenton();
            }
        }
        return uniqueinstance;
    }
}
