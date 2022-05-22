package leetcode_9;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        if(x % 10 == 0 && x != 0){
            return false;
        }


        int invertedNumber = 0;
        int copyOfX = x;
        while (copyOfX != 0) {
            invertedNumber = invertedNumber * 10 + copyOfX % 10;
            copyOfX = copyOfX / 10;
        }
        return  invertedNumber == x;

    }

}
