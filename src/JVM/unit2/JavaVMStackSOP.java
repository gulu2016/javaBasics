package JVM.unit2;

/**
 * @ProjectName: leetCodePro
 * @Package: JVM.unit2
 * @ClassName: JavaVMStackSOP
 * @Description: 通过不断递归实现虚拟机栈和本地方法栈溢出
 * @Author: gulu
 * @CreateDate: 19-3-14 下午8:22
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-14 下午8:22
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * -Xss128k
 */
public class JavaVMStackSOP {
    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args)throws Throwable{
        JavaVMStackSOP oom = new JavaVMStackSOP();
        try {
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:"+oom.stackLength);
            throw e;
        }
    }
}
