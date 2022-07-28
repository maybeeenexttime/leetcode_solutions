package leetcode_226;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        else if (root.left == null && root.right == null)
            return root;
        else if (root.left == null) {
            root.left = invertTree(root.right);
            root.right = null;
        } else if (root.right == null) {
            root.right = invertTree(root.left);
            root.left = null;
        } else {
            root.left = invertTree(root.left);
            root.right = invertTree(root.right);
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        node.right = node3;
        node.left = node1;
    }
}
