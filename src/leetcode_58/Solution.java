package leetcode_58;

public class Solution {
    public static void main(String[] args) {
        String s = "Hello World";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        int index = strings.length - 1;
        return strings[index].length();
    }
}
