package HeadFirstDesignPatterns.StatePattern;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StatePattern
 * @ClassName: HasQuarterState
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-28 下午2:48
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-28 下午2:48
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
