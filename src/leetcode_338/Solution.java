package leetcode_338;

public class Solution {
    public int[] countBits(int n) {
        int[] array = new int[n + 1];
        for (int i = 0; i <= n; i++) {
           char[] binary = Integer.toBinaryString(i).toCharArray();
            int count = 0;
            for (int j = 0; j < binary.length; j++) {
                if(binary[j] == '1'){
                   count++;
                }
            }
            array[i] = count;
        }
        return array;
    }
}
