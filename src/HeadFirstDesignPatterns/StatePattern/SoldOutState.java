package HeadFirstDesignPatterns.StatePattern;

import java.sql.SQLSyntaxErrorException;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StatePattern
 * @ClassName: SoldOutState
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-28 下午3:10
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-28 下午3:10
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter,the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't insert a quarter,the machine is sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned,but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
