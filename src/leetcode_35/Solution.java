package leetcode_35;

import java.awt.*;
import java.util.*;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, target));

    }

    public int searchInsert(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        if(list.contains(target)){
            index =  list.indexOf(target);
        } else {
            list.add(target);
            list.sort(Integer::compareTo);
            index = list.indexOf(target);
        }
        return index;
    }
}