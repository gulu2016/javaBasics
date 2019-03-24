package HeadFirstDesignPatterns.CommandPattern.AbstractCommand;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.CommandPattern
 * @ClassName: Command
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-24 下午3:03
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-24 下午3:03
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Command {
    public void execute();
    public void undo();
}
