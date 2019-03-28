package HeadFirstDesignPatterns.StatePattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StatePattern
 * @ClassName: State
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-28 下午2:42
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-28 下午2:42
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
