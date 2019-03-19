package JVM.unit3;

/**
 * @ProjectName: leetCodePro
 * @Package: JVM.unit3
 * @ClassName: GCTest
 * @Description: 代码清单3-1
 * @Author: gulu
 * @CreateDate: 19-3-15 下午1:41
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-15 下午1:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * -XX:+PrintGCDetails 打印GC日志
 */
public class GCTest {
    public Object instance = null;
    private static  final int _1MB = 1024*1024;
    private byte[] bigSize = new byte[2*_1MB];

    public static void testGC(){
        GCTest obj1 = new GCTest();
        GCTest obj2 = new GCTest();
        obj1.instance = obj2;
        obj2.instance = obj1;

        obj1 = null;
        obj2 = null;
        System.gc();
    }

    public static void main(String[] args){
        GCTest.testGC();
    }
}
