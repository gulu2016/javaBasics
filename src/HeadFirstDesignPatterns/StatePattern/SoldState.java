package HeadFirstDesignPatterns.StatePattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StatePattern
 * @ClassName: SoldState
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-28 下午2:48
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-28 下午2:48
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait,we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            System.out.println("Oops,out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
}
