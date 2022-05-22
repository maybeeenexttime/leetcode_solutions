package leetcode_26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int prev = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != prev){
                nums[j] = nums[i];
                j++;
            }
            prev = nums[i];
        }
        return j;
    }


    public static void main(String[] args) {
        int[] array = {1,1,2};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(array));
    }
}
