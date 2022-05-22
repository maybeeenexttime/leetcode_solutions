package leetcode_136;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);

        int find = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(find == nums[i]){
                find = nums[++i];
            }

        }

        return find;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}
