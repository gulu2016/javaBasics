package HeadFirstDesignPatterns.ComponentPattern;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.ComponentPattern
 * @ClassName: Client
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-31 上午11:09
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-31 上午11:09
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 *
 * 参考博客：https://www.cnblogs.com/V1haoge/p/6489827.html
 */
import java.io.File;

public class Client {
    public static void createTree(Node node) throws Exception{
        File file = new File(node.name);
        File[] f = file.listFiles();
        for(File fi : f){
            if(fi.isFile()){
                Filer filer = new Filer(fi.getAbsolutePath());
                node.addNode(filer);
            }
            if(fi.isDirectory()){
                Noder noder = new Noder(fi.getAbsolutePath());
                node.addNode(noder);
                createTree(noder);//使用递归生成树结构
            }
        }
    }
    public static void main(String[] args) {
        Node noder = new Noder("/home/zhangjiaqian/test");
        try {
            createTree(noder);
        } catch (Exception e) {
            e.printStackTrace();
        }
        noder.display();
    }
}
