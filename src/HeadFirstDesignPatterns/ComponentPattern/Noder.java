package HeadFirstDesignPatterns.ComponentPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.ComponentPattern
 * @ClassName: Noder
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-31 上午11:08
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-31 上午11:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Noder extends Node {
    List<Node> nodeList = new ArrayList<Node>();//内部节点列表（包括文件和下级目录）
    //通过构造器为当前目录节点赋名
    public Noder(String name) {
        super(name);
    }
    //新增节点
    public void addNode(Node node) throws Exception{
        nodeList.add(node);
    }
    //递归循环显示下级节点
    @Override
    void display() {
        System.out.println(name);
        for(Node node:nodeList){
            node.display();
        }
    }
}
