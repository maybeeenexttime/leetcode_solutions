package leetcode_394;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "2[abc]3[cd]ef";
        System.out.println(solution.decodeString(s));
    }

    public String decodeString(String s) {
        Deque<Character> queue = new LinkedList<>();
        for(char c : s.toCharArray()) queue.offer(c);
        return dfs(queue);
    }
    public String dfs(Deque<Character> queue){
        StringBuilder sb = new StringBuilder();
        int num = 0;
        while (!queue.isEmpty()){
            char c = queue.poll();
            if(Character.isDigit(c)){
                //высчитываем количество повторов для подстроки
                num = num * 10 + c - '0';
            } else if(c == '['){
                //если мы встретили открываеющую скобку то должны передать на следующий уровень рекурсии
                //то что осталось в очереди
                String s = dfs(queue);
                for (int i = 0; i < num; i++) {
                    sb.append(s);
                    //и num раз добавить его к строке
                }
                num = 0; //и засетить в ноль
            } else if(c == ']'){
                //текущий уровень рекурсии закончился
                break;
            } else {

                sb.append(c); //добавляем все в стринбилдер
            }
        }

        return sb.toString();
    }

}
