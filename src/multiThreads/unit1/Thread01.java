package multiThreads.unit1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @ProjectName: leetCodePro
 * @Package: multiThreads.unit1
 * @ClassName: Thread01
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-19 下午6:16
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-19 下午6:16
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
class MyThread extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println("MyThread");
    }
}
//先打印“运行结束”，再打印"MyThread"，这说明cpu以随机的时间调用线程中的run方法
public class Thread01 {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束");
    }
}
