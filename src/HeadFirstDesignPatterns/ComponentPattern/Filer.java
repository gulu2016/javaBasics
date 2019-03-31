package HeadFirstDesignPatterns.ComponentPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.ComponentPattern
 * @ClassName: Filer
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-31 上午11:07
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-31 上午11:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Filer extends Node {
    //通过构造器为文件节点命名
    public Filer(String name) {
        super(name);
    }
    //显示文件节点
    @Override
    public void display() {
        System.out.println(name);
    }
}
