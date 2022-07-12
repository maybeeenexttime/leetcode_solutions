package leetcode_96;

public class Solution {
    public int numTrees(int n) {
        int[] tree = new int[n+1];
        tree[0] = 1;
        tree[1] = 1;

        for (int i = 2; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                int left = j - 1;
                int right = i - j;
                tree[i] += tree[left] * tree[right];
            }
        }
       return   tree[n];
    }

    public static void main(String[] args) {
        int n = 3;
        Solution solution = new Solution();
        System.out.println(solution.numTrees(n));
    }
}
