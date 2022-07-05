package leetcode_98;

public class Solution {
    public boolean isValidBST(TreeNode root) {
       return isValidBst(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean isValidBst(TreeNode root,long minValue,long maxValue)
    {
        if(root == null)
        {
            return true;
        }
        if(root.val >= maxValue || root.val<= minValue) return false;
        return isValidBst(root.left,minValue,root.val) && isValidBst(root.right,root.val,maxValue);
    }
}
