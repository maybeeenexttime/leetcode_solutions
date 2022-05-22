package leetcode_345;

import java.util.HashSet;

public class Solution {
    public static String reverseVowels(String s) {
        HashSet<Character> glasnye = new HashSet<>();
        glasnye.add('a');
        glasnye.add('e');
        glasnye.add('o');
        glasnye.add('i');
        glasnye.add('u');
        glasnye.add('A');
        glasnye.add('E');
        glasnye.add('O');
        glasnye.add('I');
        glasnye.add('U');


        char[] array = s.toCharArray();

        int indexLeft = 0;
        int indexRight = array.length - 1;
        while (indexLeft < indexRight){
            while (indexLeft < indexRight && !glasnye.contains(array[indexLeft])){
                indexLeft++;
            }
            while (indexRight > indexLeft && !glasnye.contains(array[indexRight])){
                indexRight--;
            }
            char temp = array[indexLeft];
            array[indexLeft] = array[indexRight];
            array[indexRight] = temp;
            indexRight--;
            indexLeft ++;
        }

        return new String(array);
    }
    //leetcode
    //bobstrictaan
    //bobstractian

    public static void main(String[] args) {
        String s = "babstraction";
        System.out.println(reverseVowels(s));
    }
}
