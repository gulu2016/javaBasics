package HeadFirstDesignPatterns.ObserverPattern.implementWithCode;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.ObserverPattern
 * @ClassName: Subject
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-20 下午9:07
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-20 下午9:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
