package multiThreads.unit1;

/**
 * @ProjectName: leetCodePro
 * @Package: multiThreads.unit1
 * @ClassName: Thread02
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-19 下午6:34
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-19 下午6:34
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
class MyThread02 extends Thread{
    @Override
    public void run(){
        try{
            for(int i = 0;i < 10;i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Thread02 {
    public static void main(String[] args){
        try{
            MyThread02 thread02 = new MyThread02();
            thread02.setName("myThread02");
            thread02.start();
            for(int i = 0;i < 10;i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
