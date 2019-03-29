package HeadFirstDesignPatterns.AgentPattern.DynamicAgentPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AgentPattern.DynamicAgentPattern
 * @ClassName: ProxyTest
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-28 下午5:10
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-28 下午5:10
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        Service service = new UserServiceImpl();
        MyInvocatioHandler handler = new MyInvocatioHandler(service);
        Service serviceProxy = (Service)handler.getProxy();
        serviceProxy.add();
    }
}
