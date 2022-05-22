package leetcode_7;

import java.util.Arrays;

public class Solution {
    public int reverse(int x) {
        if(x < -(Math.pow(2, 31)) || x > Math.pow(2, 31)){
            return 0;
        }

        String str = Integer.toString(x);
        if(x > 0) {
            StringBuilder stringBuilder = new StringBuilder(str);
            str = stringBuilder.reverse().toString();
        }
        if(x < 0) {
            String copy = Integer.toString(x);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i < copy.length(); i++) {
                stringBuilder.append(copy.charAt(i));
            }
            copy = stringBuilder.reverse().toString();
            stringBuilder = new StringBuilder(str);
            for (int i = 1; i < str.length(); i++) {
                stringBuilder.setCharAt(i, copy.charAt(i - 1));
            }
            str = stringBuilder.toString();
        }
        if(Long.parseLong(str) > Integer.MAX_VALUE){
            return 0;
        }
        if (Long.parseLong(str) < Integer.MIN_VALUE){
            return 0;
        }

        return Integer.parseInt(str);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int x =
                945;
        System.out.println(solution.reverse(x));
    }
}
