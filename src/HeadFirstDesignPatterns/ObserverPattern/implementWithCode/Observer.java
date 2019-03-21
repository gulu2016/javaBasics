package HeadFirstDesignPatterns.ObserverPattern.implementWithCode;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.ObserverPattern
 * @ClassName: Observer
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-20 下午9:08
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-20 下午9:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Observer {
    public void update(float temp,float humidity,float pressure);
}
