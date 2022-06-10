package leetcode_5;


public class Solution {
    int resultStart;
    int resultLength;


    public String longestPalindrome(String s) {
           int strLength = s.length();
           if(strLength < 2) return s;
        for (int i = 0; i < strLength; i++) {
            expand(s, i, i+1);
            expand(s, i, i);
        }

            return s.substring(resultStart, resultStart + resultLength);
    }

    private void expand(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)) {
                left--;
                right++;
            }
            if(resultLength < right - left - 1) {
                resultStart = left + 1;
                resultLength = right - left - 1;
            }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "babad";
        System.out.println(solution.longestPalindrome(s));
    }
}
