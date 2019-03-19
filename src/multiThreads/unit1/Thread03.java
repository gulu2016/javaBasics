package multiThreads.unit1;

/**
 * @ProjectName: leetCodePro
 * @Package: multiThreads.unit1
 * @ClassName: Thread03
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-19 下午6:46
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-19 下午6:46
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

class MyThread03 extends Thread{
    private int i;
    public MyThread03(int i){
        super();
        this.i = i;
    }
    @Override
    public void run(){
        System.out.println(i);
    }
}
public class Thread03 {
    public static void main(String[] args){
        MyThread03 t1 = new MyThread03(1);
        MyThread03 t2 = new MyThread03(2);
        MyThread03 t3 = new MyThread03(3);
        MyThread03 t4 = new MyThread03(4);
        MyThread03 t5 = new MyThread03(5);
        MyThread03 t6 = new MyThread03(6);
        MyThread03 t7 = new MyThread03(7);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}
