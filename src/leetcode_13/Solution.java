package leetcode_13;

import java.util.HashMap;

public class Solution {


    public static void main(String[] args){
       String s = "MCMXCIV";
       Solution solution = new Solution();
       System.out.println(solution.romanToInt(s));
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] character = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < character.length - 1; i++) {
            if(map.get(character[i]) < map.get(character[i + 1])){
                sum -= map.get(character[i]);
            } else
            sum += map.get(character[i]);
        }
        sum += map.get(character[character.length - 1]);
        return sum ;
    }

}
