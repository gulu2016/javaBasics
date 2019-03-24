package HeadFirstDesignPatterns.CommandPattern.ConcreteCommands;

import HeadFirstDesignPatterns.CommandPattern.AbstractCommand.Command;
import HeadFirstDesignPatterns.CommandPattern.Light;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.CommandPattern
 * @ClassName: LightOnCommand
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-24 下午3:15
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-24 下午3:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
