package leetcode_75;

import java.util.Arrays;

public class Solution {
    public void sortColors(int[] nums) {
        int[] copy = new int[nums.length];
        Arrays.fill(copy, 1);
        int copyRight = copy.length - 1;
        int copyLeft = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                copy[copyLeft] = 0;
                copyLeft ++;
            }
            if(nums[i] == 2){
                copy[copyRight] = 2;
                copyRight--;
            }
        }

        for (int i = 0; i < copy.length; i++) {
            nums[i] = copy[i];
        }


    }

    public static void main(String[] args) {
        int[] nums1 = {2,0,2,1,1,0};
        Solution solution = new Solution();
        solution.sortColors(nums1);
        System.out.println(nums1);
    }
}
