package leetcode_1;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        return answer;

    }
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        Solution solution = new Solution();
        solution.twoSum(array, 9);
    }
}
