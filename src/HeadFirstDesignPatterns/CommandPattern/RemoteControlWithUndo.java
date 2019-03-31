package HeadFirstDesignPatterns.CommandPattern;

import HeadFirstDesignPatterns.CommandPattern.AbstractCommand.Command;
import HeadFirstDesignPatterns.CommandPattern.ConcreteCommands.NoCommand;

import java.util.Arrays;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.CommandPattern
 * @ClassName: RemoteControlWithUndo
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-24 下午3:19
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-24 下午3:19
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0;i < 7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        return "RemoteControlWithUndo{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                ", undoCommand=" + undoCommand +
                '}';
    }
}
