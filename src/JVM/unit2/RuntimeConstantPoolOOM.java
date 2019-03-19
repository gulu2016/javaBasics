package JVM.unit2;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: leetCodePro
 * @Package: JVM.unit2
 * @ClassName: RuntimeConstantPoolOOM
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-14 下午8:32
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-14 下午8:32
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * -XX:PermSize=10M -XX:MaxPermSize=10M(弃用)
 * -XX:MetaspaceSize=10M -XX:MaxMetaspaceSize=10M
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true){
            //intern()方法先检查常量池中是否有该字符串，没有则加入常量池，并返回
            list.add(String.valueOf(i++).intern());
        }
    }
}
