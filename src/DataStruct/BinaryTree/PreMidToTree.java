package DataStruct.BinaryTree;

/**
 * @ProjectName: leetCodePro
 * @Package: DataStruct.BinaryTree
 * @ClassName: PreMidToTree
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-31 下午3:29
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-31 下午3:29
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 *
 * 算法描述：在知道前序，中序的情况下，还原二叉树
 */


public class PreMidToTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode reConstructBinaryTree(int[] pre,int[] in) {
        TreeNode root = reConstructTree(0,pre.length-1,pre,0,in.length-1,in);
        return root;
    }
    private TreeNode reConstructTree(int preStart,int preEnd,int[] pre,int inStart,
                                     int inEnd,int[] in){
        //是否有牛奶
        if(preStart>preEnd || inStart>inEnd)
            return null;
        //喝一口牛奶
        //调用喝牛奶函数
        TreeNode root = new TreeNode(pre[preStart]);
        for(int i = inStart;i <= inEnd;i++ ){
            if(in[i] == pre[preStart]){
                root.left = reConstructTree(preStart+1,preStart+i-inStart,pre,inStart,i-1,in);
                root.right = reConstructTree(preEnd-(inEnd-i-1),preEnd,pre,i+1,inEnd,in);
            }
        }
        return root;
    }
}
