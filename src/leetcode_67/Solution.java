package leetcode_67;

import java.math.BigInteger;

//1111
//1010
//   11001
public class Solution {
    public static String addBinary(String a, String b) {
        BigInteger aa = new BigInteger(a, 2);
        BigInteger bb = new BigInteger(b,2);

        return (aa.add(bb).toString(2));
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";

        System.out.println(addBinary(a, b));
    }
}
