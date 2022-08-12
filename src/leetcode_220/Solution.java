package leetcode_220;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,5,9,1,5,9};
        int k = 2;
        int t = 3;
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyAlmostDuplicate(nums, k, t));
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums.length <= 1){
            return false;
        }
        for (int i = 1, j = 0; i > j ; i++) {
                if (Math.abs((long)nums[j] - (long)nums[i]) <= t && Math.abs(j - i) <= k) {
                        return true;
                }

                if (i == nums.length - 1) {
                    j++;
                    i = j;
                }
                if (j == nums.length - 1) {
                    return false;
                }
            }
        return false;
    }
}
