package leetcode_100;


class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
          return dfs(p,q);
        }

        public boolean dfs(TreeNode p, TreeNode q){
            if(p == null && q == null) return true;
            if(p == null || q == null) return false;
            if(p.val != q.val) return false;

            return dfs(p.left, q.left) && dfs(p.right, q.right);
        }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node.left = node2;
        node.right = node3;

        TreeNode second = new TreeNode(1);
        TreeNode second2 = new TreeNode(2);
        TreeNode second3 = new TreeNode(3);
        second.left = second2;
        second.right = second3;

        Solution solution = new Solution();

        System.out.println(solution.isSameTree(node, second));
    }
}
