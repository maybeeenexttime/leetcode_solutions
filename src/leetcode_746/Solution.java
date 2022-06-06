package leetcode_746;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int first = 0;
        int second = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            int current = cost[i] + Math.min(first, second);
            first = second;
            second = current;
        }
        return Math.min(first, second);
    }

    public static void main(String[] args) {
        int[] example = {1,100,1,1,1,100,1,1,100,1};
        Solution solution = new Solution();
        System.out.println(solution.minCostClimbingStairs(example));
    }
}
