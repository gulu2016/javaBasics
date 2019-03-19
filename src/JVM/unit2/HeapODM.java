package JVM.unit2;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: leetCodePro
 * @Package: JVM.unit2
 * @ClassName: HeapODM
 * @Description: 验证堆溢出情况
 * @Author: gulu
 * @CreateDate: 19-3-14 下午8:08
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-14 下午8:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * -Xms20m -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapODM {
    static class ODMObject{

    }
    public static void main(String[] args){
        List<ODMObject> list = new ArrayList<>();
        while (true){
            list.add(new ODMObject());
        }
    }
}
