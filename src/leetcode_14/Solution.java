package leetcode_14;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        char[] charArray = strs[0].toCharArray();
        for (int j = 0; j < charArray.length ; j++) {
                for (int i = 0; i < strs.length; i++) {
                    char currentChar = charArray[j];
                    if(j == strs[i].length() || strs[i].charAt(j) != currentChar ){
                        return strs[0].substring(0, j);
                    }
                }
        }



    return strs[0];
    }
    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println( longestCommonPrefix(strs));

    }
}
