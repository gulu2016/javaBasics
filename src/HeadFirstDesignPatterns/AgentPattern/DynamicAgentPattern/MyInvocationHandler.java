package HeadFirstDesignPatterns.AgentPattern.DynamicAgentPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AgentPattern.DynamicAgentPattern
 * @ClassName: MyInvocationHandler
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-28 下午5:08
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-28 下午5:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
class MyInvocatioHandler implements InvocationHandler {
    private Object target;

    public MyInvocatioHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----before-----");
        Object result = method.invoke(target, args);
        System.out.println("-----end-----");
        return result;
    }
    // 生成代理对象
    public Object getProxy() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, this);
    }
}
