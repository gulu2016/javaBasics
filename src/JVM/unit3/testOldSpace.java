package JVM.unit3;

/**
 * @ProjectName: leetCodePro
 * @Package: JVM.unit3
 * @ClassName: testOldSpace
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-15 下午8:04
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-15 下午8:04
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:PretenureSizeThreshold=3145720
 * 本来要设置新生代一次分配3MB，但是这个参数好像没有用
 */
public class testOldSpace {
    private static final int _1MB = 1024*1024;
    public static void testPretenureSizeThreshold(){
        byte[] allocation;
        allocation = new byte[4*_1MB];
    }
    public static void main(String[] args){
        testPretenureSizeThreshold();
    }
}
