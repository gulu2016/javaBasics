package HeadFirstDesignPatterns.CommandPattern;

import HeadFirstDesignPatterns.CommandPattern.ConcreteCommands.LightOffCommand;
import HeadFirstDesignPatterns.CommandPattern.ConcreteCommands.LightOnCommand;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.CommandPattern
 * @ClassName: RemoteLoader
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-24 下午3:29
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-24 下午3:29
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class RemoteLoader {
    public static void main(String[] args){
        //RemoteControlWithUndo是命令菜单
        //AbstractCommand是命令的抽象，Concrete是命令的实现
        //Light是命令控制的实体
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Light livingRoomLight = new Light();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControlWithUndo.setCommand(0,livingRoomLightOn,livingRoomLightOff);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);

        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);

        remoteControlWithUndo.undoButtonWasPushed();

    }
}
