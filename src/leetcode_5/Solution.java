package leetcode_5;


public class Solution {
    public int maxLen = 0;
    public int start = 0;


    public String longestPalindrome(String s) {
            for(int i = 0; i < s.length(); i++) {
                expand(i,i + 1, s);
                expand(i, i, s);
            }
            return s.substring(start, start + maxLen);
    }

    private void expand(int left, int right, String s) {
            while (left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)) {
                left--;
                right++;
            }
            if(maxLen < right - left + 1) {
                maxLen = right - left - 1;
                start = left + 1;
            }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "babad";
        System.out.println(solution.longestPalindrome(s));
    }
}
