package Sofia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        String[] txt1 = {"123", "456", "A", "B"};
        String[] txt2 = {"268", "456"};
        Solution solution = new Solution();
        solution.getDifferentStrings(txt1, txt2);
    }

    public void getDifferentStrings(String[] strings1, String[] strings2){
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings1.length; i++) {
            map.put(strings1[i], i + 1);
        }
        for (int i = 0; i < strings2.length; i++) {
            if(!map.containsKey(strings2[i])){
                map.put(strings2[i], i + 1);
                continue;
            } else {
                map.remove(strings2[i]);
            }
        }
        map.forEach((k,v)->System.out.println("#" + v + ">" + k));
    }

}
