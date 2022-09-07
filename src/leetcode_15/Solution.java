package leetcode_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new LinkedList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                List<Integer> triplet = new LinkedList<>();

                for (int k = j + 1; k < nums.length ; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                    }
                    if(!triplet.isEmpty()){
                        lists.add(triplet);
                    }
                }
            }
            
        }
        return lists;
    }
}
