package leetcode_79;

public class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        int index = 0;
        for (int i = 0; i < board.length - 1; i++) {
            for (int j = 0; j < board[0].length - 1; j++) {
                if (board[i][j] == word.charAt(index)) {
                   if(hasNextChar(board, i, j, word, index, visited)){
                       index++;
                   } else {
                       index = 0;
                   }
                }
            }
        }
        return index == word.length() - 1;
    }

    public boolean hasNextChar(char[][] board, int i, int j, String word, int index, boolean[][] visited){
        int a = board.length;
        int b = board[0].length;
        if(i < 0 || i >= a || j < 0 || j >= b || board[i][j] != word.charAt(i) || visited[i][j]){
            return false;
        }
        visited[i][j] = true;
        if (board[i][j + 1] == word.charAt(index + 1)) {
                visited[i][j + 1] = true;
                return true;
        }
        if(j != 0) {
            if (board[i][j - 1] == word.charAt(index + 1)) {
                visited[i][j - 1] = true;
                return true;
            }
        }
        if(board[i + 1][j] == word.charAt(index + 1)){
            visited[i + 1][j] = true;
            return true;
        }
        if(i != 0) {
            if (board[i - 1][j] == word.charAt(index + 1)) {
                visited[i - 1][j] = true;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        String word = "ABCCED";
        Solution solution = new Solution();
        System.out.println(solution.exist(board, word));
    }
}
