package leetcode_387;

import java.util.HashMap;

public class Solution {
    public static int firstUniqChar(String s) {
        char[] array = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(!map.containsKey(array[i])){
                map.put(array[i], 1);
            } else {
               int value = map.get(array[i]) + 1;
               map.put(array[i], value);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(map.get(array[i]) == 1){
                return i;
            }
        }


        return -1;
    }

//    better solution

//    int[] count= new int[26];
//
//    int n=s.length();
//        for(int i=0;i<n;i++)
//    {
//        count[s.charAt(i) - 'a']++;
//    }
//        for(int i=0;i<n;i++)
//    {
//        if(count[s.charAt(i)-'a'] == 1){
//            return i;
//        }
//    }
//        return -1;

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }

}
