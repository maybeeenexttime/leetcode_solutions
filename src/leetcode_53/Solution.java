package leetcode_53;

public class Solution {
        public int maxSubArray(int[] nums) {

            int max = nums[0];
            int sum = nums[0];

            for ( int i = 1; i < nums.length; i++) {
                sum = Math.max(nums[i], sum + nums[i]);
                max = Math.max(max, sum);
            }

            return max;
        }

    public static void main(String[] args) {
        int[] example = {-2,1,-3,4,-1,2,1,-5,4};
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(example));
    }
}
