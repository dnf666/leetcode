package medium;

/**
 * created on 2019/11/24
 *
 * @author dailinfu
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class 从二叉搜索树到最大和树 {
    private int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        largeAdd(root);
        return root;
    }

    private void largeAdd(TreeNode root) {
        if (root == null){
            return;
        }
        largeAdd(root.right);
        root.val += sum;
        sum = root.val;
        largeAdd(root.left);
    }
}
