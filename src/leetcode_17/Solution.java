package leetcode_17;

import java.util.*;

public class Solution {


    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        Map<Integer, List<String>> map = new HashMap<>();
        map.put(2, new ArrayList<>(Arrays.asList("a", "b", "c")));
        map.put(3, new ArrayList<>(Arrays.asList("d", "e", "f")));
        map.put(4, new ArrayList<>(Arrays.asList("g", "h", "i")));
        map.put(5, new ArrayList<>(Arrays.asList("j", "k", "l")));
        map.put(6, new ArrayList<>(Arrays.asList("m", "n", "o")));
        map.put(7, new ArrayList<>(Arrays.asList("p", "q", "r", "s")));
        map.put(8, new ArrayList<>(Arrays.asList("t", "u", "v")));
        map.put(9, new ArrayList<>(Arrays.asList("w", "x", "y", "z")));

        List<String> result = new ArrayList<>();
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
           List<String> temp = new ArrayList<>();
           int current = digits.charAt(i) - '0';
           List<String> curstr = map.get(current);
           for(String s: result){
               for (String x: curstr){
                   temp.add(s + x);
               }

           }
           result = temp;
        }


        return result;
    }



    public static void main(String[] args) {
        String digits = "23";
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations(digits));
    }
}
