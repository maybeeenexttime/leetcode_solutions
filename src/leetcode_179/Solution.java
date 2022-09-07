package leetcode_179;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public String largestNumber(int[] nums) {
        List<String> arr = new ArrayList<>();
        for(int x : nums) arr.add(String.valueOf(x));

        Collections.sort(arr, new myComp());

        if (arr.get(0).equals("0")) {
            return "0";
        }

        String ans = "";
        for(String x : arr)
            ans+=x;
        return ans;
    }
    class myComp implements Comparator<String> {
        @Override
        public int compare(String x, String y){
            String a = x+y;
            String b = y+x;

            return a.compareTo(b) > 0 ? -1 : 1;
        }
    }
}
