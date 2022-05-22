package leetcode_125;

public class Solution {
    public static boolean isPalindrome(String s) {
        if(s.length() == 1){
            return true;
        }
        String ss = s.replaceAll("\\W|_", "");
        StringBuilder stringBuilder = new StringBuilder(ss);

        return ss.equalsIgnoreCase(stringBuilder.reverse().toString()) ;
    }

    public static void main(String[] args) {
        String  s = "ab_a";
        System.out.println(isPalindrome(s));
    }
}
