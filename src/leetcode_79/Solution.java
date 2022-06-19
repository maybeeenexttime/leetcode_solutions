package leetcode_79;

public class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i <= board.length - 1; i++) {
            for (int j = 0; j <= board[0].length - 1; j++) {
                if (board[i][j] == word.charAt(0) && hasNextChar(board, i, j, word, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasNextChar(char[][] board, int i, int j, String word, int index, boolean[][] visited){
        if(word.length() == index){
            return  true;
        }

        if(i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || board[i][j] != word.charAt(index) || visited[i][j]){
            return false;
        }
        visited[i][j] = true;
        if(hasNextChar(board, i, j + 1, word, index + 1, visited) ||
                (hasNextChar(board, i + 1, j, word, index + 1, visited) ||
                        hasNextChar(board, i, j - 1, word, index + 1, visited) ||
                        hasNextChar(board, i -  1, j, word, index + 1, visited))){
            return true;
        }
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        String word = "SEE";
        Solution solution = new Solution();
        System.out.println(solution.exist(board, word));
    }
}
