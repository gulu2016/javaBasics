package JVM.unit3;

/**
 * @ProjectName: leetCodePro
 * @Package: JVM.unit3
 * @ClassName: testEden
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-15 下午7:19
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-15 下午7:19
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * 参数含义java堆大小为20M,10MB给新生代，剩下10M给老年代，Eden:Survivor=8:1
 * (共有两个Survivor空间，所以新生代空间分配是8:1:1)
 */
public class testEden {
    private static final int _1MB = 1024*1024;

    public static void testAllocation(){
        byte[] allocation1 = new byte[2*_1MB];
        byte[] allocation2 = new byte[2*_1MB];
        byte[] allocation3 = new byte[2*_1MB];
        byte[] allocation4 = new byte[2*_1MB];
    }
    public static void main(String[] args){
        testAllocation();
    }
}
