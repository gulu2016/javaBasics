package HeadFirstDesignPatterns.StatePattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StatePattern
 * @ClassName: NoQuarterState
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-28 下午2:44
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-28 下午2:44
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you insert a quarter!");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned,but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
