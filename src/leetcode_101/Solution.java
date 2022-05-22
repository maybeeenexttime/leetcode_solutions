package leetcode_101;


public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return false;
        }

    return dfs(root.right, root.left);
    }

    public boolean dfs(TreeNode right, TreeNode left ){
        if(right == null && left == null) return true;
        if(right == null || left == null) return false;
        if(right.val != left.val){
          return false;
        }
        return dfs(left.left, right.right) && dfs(left.right, right.left);

    }
}
