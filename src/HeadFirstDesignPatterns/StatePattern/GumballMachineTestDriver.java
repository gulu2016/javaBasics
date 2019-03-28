package HeadFirstDesignPatterns.StatePattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.StatePattern
 * @ClassName: GumballMachineTestDriver
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-28 下午3:30
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-28 下午3:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class GumballMachineTestDriver {
    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
