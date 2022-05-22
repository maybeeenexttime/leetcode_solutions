package leetcode_169;

public class Solution {
    public int majorityElement(int[] nums) {
        int majCnt = nums.length/2;
        for (int num: nums) {
            int cnt = 0;
            for (int el: nums) {
                if (el == num) {
                    cnt += 1;
                }
            }
            if (cnt > majCnt) {
                return num;
            }
        }
        return nums[0];
    }
}
