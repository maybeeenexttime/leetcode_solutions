package leetcode_200;

public class Solution {
    public int numIslands(char[][] grid) {
        int countIsland = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1'){
                  countIsland++;
                  destroyIsland(grid, i, j);
                }
            }

        }
        return countIsland;
    }

    public void destroyIsland(char[][] grid, int i, int j){
        if(grid[i][j] == '1'){
            grid[i][j] = '0';
        } else {
            return;
        }
        if(j < grid[0].length - 1 && grid[i][j + 1] == '1' ){
            destroyIsland(grid, i, j + 1);
        }
        if(j > 0 && grid[i][j - 1] == '1'){
            destroyIsland(grid, i, j -1);
        }
        if(i < grid.length - 1 && grid[i + 1][j] == '1'){
            destroyIsland(grid, i + 1, j);
        }
        if(i > 0 && grid[i - 1][j] == '1'){
            destroyIsland(grid, i - 1, j);
        }

    }



    public static void main(String[] args) {
        char[][] grid = {{'1','1','0','0','0'},
        {'1','1','0','0','0'},
        {'0','0','1','0','0'},
        {'0','0','0','1','1'}};
        Solution solution = new Solution();
        System.out.println(solution.numIslands(grid));
    }
}
