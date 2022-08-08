package leetcode_110;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }

        if(!isBalanced(root.left) || !isBalanced(root.right)) {
            return false;
        }

        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1;

    }
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left) , maxDepth(root.right)) + 1;
    }
}
