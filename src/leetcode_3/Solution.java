package leetcode_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxPrefix = 0;
        //создаем мапу для хранения чаров и их индексов
        for (int i = 0, j = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                //проверяем содержится ли данная буква в мапе, если да то меняем j
                j = Math.max(j, map.get(s.charAt(i)) + 1);
                //индекс буквы от которой до i уникальны
            }
            map.put(s.charAt(i), i);
            //добавляем в мапу чар и его индекс
            maxPrefix = Math.max(maxPrefix, i - j + 1);
            //высчитываем максимальную длину
        }

    return maxPrefix;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
