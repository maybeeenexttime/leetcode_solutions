package leetcode_28;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String a = "mississippi";
        String b = "issip";
        solution.strStr(a, b);
    }

    public int strStr(String haystack, String needle) {
        if(haystack.equals("")&&!needle.equals(""))
            return -1;
        if(haystack.equals("")&&needle.equals(""))
            return 0;
        if(!haystack.equals("")&&needle.equals(""))
            return 0;

        int k = 0;
        int l = 0;
        while (k < haystack.length()) {
            if (haystack.charAt(k) == needle.charAt(l)) {
                k++;
                l++;
                if (l == needle.length()-1) {
                    return k - l;
                } else {
                    continue;
                }
            } else {
                k++;
                l = 0;
            }
        }
        return -1;
    }
}









          //  if(needle != null) {
//                int index = haystack.indexOf(needle);
//                return index;
//            }
//            else
//            if (needle == null){
//                return 0;
//            } else {
//                return -1;
//            }

//
//

//        }

//}
