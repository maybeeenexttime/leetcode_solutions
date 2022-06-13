package leetcode_78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();
        mainList.add(emptyList);

        for (int i = 0; i < nums.length; i++) {
            int j = mainList.size();
            for (int k = 0; k < j; k++) {
                List<Integer> temp = new ArrayList<>();
                temp.addAll(mainList.get(k));
                temp.add(nums[i]);
                mainList.add(temp);
            }
        }
        return mainList;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Solution solution = new Solution();
        System.out.println(solution.subsets(nums));
    }
}
