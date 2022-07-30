package leetcode_80;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int repeat = 1;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[index]) {
                repeat += 1;
            } else {
                repeat = 1;
            }
            if(repeat <= 2){
                nums[++index] = nums[i];
            }

        }

        return index + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(nums));
    }
}
