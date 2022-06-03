package leetcode_242;

import java.util.*;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        String s2 = Arrays.toString(s1);
        String t2 = Arrays.toString(t1);
        return s2.equals(t2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(solution.isAnagram(s, t));
    }
}
