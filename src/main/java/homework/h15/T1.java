package homework.h15;

// base
// https://leetcode.com/problems/invert-binary-tree/
public class T1 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode invertedLeft = invertTree(root.left);
        TreeNode invertedRight = invertTree(root.right);

        root.left = invertedRight;
        root.right = invertedLeft;

        return root;
    }
}