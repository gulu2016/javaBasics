package HeadFirstDesignPatterns.CommandPattern.ConcreteCommands;

import HeadFirstDesignPatterns.CommandPattern.AbstractCommand.Command;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.CommandPattern
 * @ClassName: NoCommand
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-24 下午3:19
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-24 下午3:19
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
