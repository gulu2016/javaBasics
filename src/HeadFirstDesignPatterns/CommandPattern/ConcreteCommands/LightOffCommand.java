package HeadFirstDesignPatterns.CommandPattern.ConcreteCommands;

import HeadFirstDesignPatterns.CommandPattern.AbstractCommand.Command;
import HeadFirstDesignPatterns.CommandPattern.Light;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.CommandPattern
 * @ClassName: LightOffCommand
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-24 下午3:16
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-24 下午3:16
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
