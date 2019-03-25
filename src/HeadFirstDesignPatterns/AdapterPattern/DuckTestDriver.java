package HeadFirstDesignPatterns.AdapterPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.AdapterPattern
 * @ClassName: DuckTestDriver
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-25 下午2:14
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-25 下午2:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class DuckTestDriver {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();

        //创建一只火鸡，再用这只火鸡包装成一个鸭子
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkey.fly();

        testDuck(duck);

        //使用火鸡包装的鸭子也可以通过鸭子测试类
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
