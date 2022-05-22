package leetcode_704;

public class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int index = nums.length - 1;
        int mid = 0;
        while (i <= index){
            mid = (i + index)/2;
            if(nums[mid] < target){
                i = mid + 1;
            } else if(nums[mid] > target){
                index = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;

    }
}