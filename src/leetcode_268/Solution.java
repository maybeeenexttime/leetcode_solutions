package leetcode_268;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int expected = 0;

        for (int i = 0; i < nums.length; i++) {
            if (expected != nums[i])
            break;
            expected++;
        }
        return expected;

    }
}
