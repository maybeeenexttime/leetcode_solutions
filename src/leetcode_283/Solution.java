package leetcode_283;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0,1, 0,3,12};
        Solution solution = new Solution();
        solution.moveZeroes(nums);

    }
    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                if(i != j){
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
