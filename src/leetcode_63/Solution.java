package leetcode_63;

public class Solution {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] grid = new int[m][n];
        grid[0][0] = obstacleGrid[0][0] == 1? 0 : 1;

        for (int i = 1; i < m; i++) {
            grid[i][0] = obstacleGrid[i][0] == 1 ? 0 : grid[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            grid[0][i] = obstacleGrid[0][i] == 1 ? 0 : grid[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] != 1){
                grid[i][j] = grid[i][j - 1] + grid[i - 1][j]; } else {
                    grid[i][j] = 0;
                }
            }
        }


        return grid[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

}
