package HeadFirstDesignPatterns.AgentPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AgentPattern
 * @ClassName: StatciAgentPattern
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-28 下午4:59
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-28 下午4:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
interface Subject {
    void request();
}

class RealSubject implements Subject {
    public void request(){
        System.out.println("RealSubject");
    }
}

class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }
    public void request(){
        System.out.println("begin");
        subject.request();
        System.out.println("end");
    }
}

public class StatciAgentPattern {
    public static void main(String args[]) {
        RealSubject subject = new RealSubject();
        Proxy p = new Proxy(subject);
        p.request();
    }
}
