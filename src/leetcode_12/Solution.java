package leetcode_12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int num = 1994;

        System.out.println(intToRoman(num));
    }


    public static String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        ArrayList<Integer> arrayList = new ArrayList<>(map.keySet());
        arrayList.sort(Integer::compareTo);
        System.out.println(arrayList);
        ArrayList<String> strings = new ArrayList<>();
        int length = arrayList.size() - 1;
        while (length >= 0){

            if(num >= arrayList.get(length)){
                num -= arrayList.get(length);
                strings.add(map.get(arrayList.get(length)));
            } else {
                length--;
            }


        }
        String string = strings.toString().replaceAll("[,\\s\\[\\]]", "");



        return string;
    }

}
