package leetcode_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "){";
        System.out.println(solution.isValid(s));

    }




    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        boolean isValid = true;
        if(charArray.length % 2 == 1){
            return false;
        }
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == '('){
                stack.push(')');
            }
            else if(charArray[i] == '{'){
                stack.push('}');
            }
            else if(charArray[i] == '['){
                stack.push(']');
            } else {
                if(stack.empty()){
                    isValid = false;
                }
                else{
                    char lastChar = stack.pop();
                    isValid = lastChar == charArray[i];
                }
                if (!isValid) {
                    break;
                }

            }

        }
        if(!stack.empty()){
            isValid = false;
        }

    return isValid;
    }
}