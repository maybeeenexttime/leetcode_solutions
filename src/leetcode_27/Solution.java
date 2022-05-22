package leetcode_27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        Solution solution = new Solution();
        System.out.println(solution.removeElement(nums, val));
    }

        public int removeElement(int[] nums, int val) {
            int j = 0;

            for (int i = 0; i < nums.length; i++){
                if(nums[i] != val){
                    nums[j] = nums[i];
                    j++;
                }
            }
            return j;
        }
}
