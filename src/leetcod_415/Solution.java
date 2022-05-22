package leetcod_415;

import java.util.ArrayList;

public class Solution {
    public String addStrings(String num1, String num2) {
        int[] array1 = new int[num1.length()];
        int[] array2 = new int[num2.length()];

        for (int i = 0; i < num1.length(); i++) {
            array1[i] = num1.charAt(i) - '0';
        }
        for (int i = 0; i < num2.length(); i++) {
            array2[i] = num2.charAt(i) - '0';
        }
        StringBuilder sb = new StringBuilder();
        int carry = 0;
         for(int i = array1.length - 1, j = array2.length - 1; i >= 0 || j >= 0 || carry == 1; i--, j--){
             int firstNumber = i < 0 ? 0 : array1[i];
             int secondNumber = j < 0 ? 0 : array2[j];
              carry = (firstNumber + secondNumber + carry);
              sb.append(carry%10);
              carry /= 10;
         }


     return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "1";
        String s2 = "9";
        System.out.println(solution.addStrings(s1,s2));
    }

}
