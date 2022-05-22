package leetcode_344;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public void reverseString(char[] s) {
        int j = s.length - 1;
        char c;
        for (int i = 0; i < s.length / 2; i++) {
            c = s[i];
            s[i] = s[j];
            s[j] = c;
            j--;
        }

    }
}
