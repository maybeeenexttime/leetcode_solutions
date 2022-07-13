package leetcode_47;

import java.util.*;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);

        return dfs(nums, 0);
    }

    protected List<List<Integer>> dfs(int[] nums, int index ){
        Set<List<Integer>> lists = new HashSet<>();
        if(index == nums.length - 1){
            List<Integer> list = new ArrayList<>();
            list.add(nums[index]);
            lists.add(list);
        } else {
            List<List<Integer>> nextList = dfs(nums, index + 1);
            for (List<Integer> list : nextList){
                for (int i = 0; i <= list.size(); i++) {
                    List<Integer> list1 = new ArrayList<>();
                    list1.addAll(list);
                    list1.add(i, nums[index]);
                    lists.add(list1);
                }
            }
        }

        return lists.stream().toList();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        Solution solution =  new Solution();
        System.out.println(solution.permuteUnique(nums));
    }
}
