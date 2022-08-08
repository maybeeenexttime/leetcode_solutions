package leetcode_463;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1){
                   perimeter += hasPerimeter(grid, i, j);
                }
            }
        }
        return perimeter;
    }

    public int hasPerimeter(int[][] grid, int i, int j){
        int resPerimeter = 4;
        if(j < grid[0].length - 1 && grid[i][j + 1] == 1 ){
            resPerimeter -= 1;
        }
        if(j > 0 && grid[i][j - 1] == 1){
            resPerimeter -= 1;
        }
        if(i < grid.length - 1 && grid[i + 1][j] == 1){
            resPerimeter -= 1;
        }
        if(i > 0 && grid[i - 1][j] == 1){
            resPerimeter -= 1;
        }
        return resPerimeter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
       int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(solution.islandPerimeter(grid));
    }
}
