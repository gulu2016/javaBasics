package DataStruct.BinaryTree;

/**
 * @ProjectName: leetCodePro
 * @Package: DataStruct.BinaryTree
 * @ClassName: ConstructSearchTree
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-31 下午3:52
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-31 下午3:52
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 *
 * 使用递归方法实现二叉排序树的插入
 */
public class ConstructSearchTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public void insertBST(TreeNode root,int val){
        if(root == null){
            root = new TreeNode(val);
            root.left = null;
            root.right = null;
            return;
        }
        if(val > root.val){
            if(root.right == null)
                root.right = new TreeNode(val);
            else
                insertBST(root.right,val);
        }else {
            if(root.left == null)
                root.left = new TreeNode(val);
            else
                insertBST(root.left,val);
        }
    }
}
