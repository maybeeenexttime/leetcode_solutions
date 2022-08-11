package leetcode_219;

import java.util.HashMap;

public class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                index = map.get(nums[i]);
                if(Math.abs(index - i) <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyDuplicate(nums, k));
    }
}
