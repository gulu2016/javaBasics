package HeadFirstDesignPatterns.ComponentPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.ComponentPattern
 * @ClassName: Node
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-31 上午11:07
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-31 上午11:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class Node {
    protected String name;//名称
    //构造器赋名
    public Node(String name){
        this.name = name;
    }
    //新增节点：文件节点无此方法，目录节点重写此方法
    public void addNode(Node node) throws Exception{
        throw new Exception("Invalid exception");
    }
    //显示节点：文件与目录均实现此方法
    abstract void display();
}
