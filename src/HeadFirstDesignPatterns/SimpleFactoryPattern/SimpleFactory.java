package HeadFirstDesignPatterns.SimpleFactoryPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.SimpleFactoryPattern
 * @ClassName: SimpleFactory
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-30 上午10:34
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-30 上午10:34
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SimpleFactory {
    public static Human makeHuman(String type){
        if(type.equals("man")){
            Human man = new Man();
            return man;
        }else if(type.equals("woman")){
            Human woman = new Woman();
            return woman;
        }else{
            System.out.println("生产不出来");
            return null;
        }
    }
}
