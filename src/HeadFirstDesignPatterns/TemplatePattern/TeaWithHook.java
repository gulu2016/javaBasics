package HeadFirstDesignPatterns.TemplatePattern;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.TemplatePattern
 * @ClassName: TeaWithHook
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-26 下午2:30
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-26 下午2:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TeaWithHook extends CaffeineBeverageWithHook{

    @Override
    void brew() {
        System.out.println("Dripping Tea through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk for tea");
        System.out.println();
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();

        if(answer.equals("y"))
            return true;
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;

        System.out.println("Would you like milk and sugar with your tea (y/n)?");

        Scanner sc = new Scanner(System.in);
        String ans = sc.next();

        return ans;
    }
}
