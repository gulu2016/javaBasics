package JVM.unit3;

/**
 * @ProjectName: leetCodePro
 * @Package: JVM.unit3
 * @ClassName: FinallizeEscapeGC
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-15 下午2:47
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-15 下午2:47
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class FinallizeEscapeGC {
    public static FinallizeEscapeGC SAVE_HOOK = null;

    public void isAlive(){
        System.out.println("yes,i am still alive;");
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println("finalize method executed");
        //在执行执行System.gc()方法时会调用对象的finalize方法
        // 但是这里对象又找到了靠山：将该对象赋值给类的静态对象，所以可以避免被回收
        FinallizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args)throws Throwable{
        SAVE_HOOK = new FinallizeEscapeGC();

        //这里释放了SAVE_HOOK连接，所以就会被标记为垃圾
        SAVE_HOOK = null;
        //系统调用垃圾回收方法，会自动执行finalize方法
        System.gc();
        Thread.sleep(500);
        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }
        else
            System.out.println("no,i am dead");

        //由于上一次系统执行了finalize方法，并且finalize方法只会执行一次
        //那么此次System.gc()将不会触发finalize方法
        //对象不会找到靠山，所以就会被回收了
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }
        else
            System.out.println("no,i am dead");
    }
}
