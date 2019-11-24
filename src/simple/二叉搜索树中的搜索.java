package simple;

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

public class 二叉搜索树中的搜索 {
    private TreeNode aim;

    public TreeNode searchBST(TreeNode root, int val) {
        return firstSearch(root, val);
    }

    private TreeNode firstSearch(TreeNode root, int val) {
        if (root.val == val) {
            aim = root;
            return aim;
        }
        if (root.left != null) {
            firstSearch(root.left, val);
            if (aim != null) {
                return aim;
            }
        }
        if (root.right != null) {
            firstSearch(root.right, val);
            if (aim != null) {
                return aim;
            }
        }
        return null;

    }
}
