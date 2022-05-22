package leetcode_695;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int max = 0;

        for (int i = 0; i <= grid.length - 1; i++) {
            for (int j = 0; j <= grid[0].length - 1; j++) {
                if(grid[i][j] == 1){
                    int currentArea = areaOfIsland(grid, i, j, visited);
//                    System.out.println(currentArea);
                  max = Math.max(max, currentArea);
                }
            }

        }
        return max;
    }

        public int areaOfIsland(int[][] grid, int i, int j, boolean[][] visited){
            int a = grid.length;
            int b = grid[0].length;
            if(i < 0 || i >= a || j < 0 || j >= b || grid[i][j] == 0 || visited[i][j]){
                return 0;
            }
            visited[i][j] = true;
            int area = grid[i][j] + areaOfIsland(grid, i +1, j, visited) + areaOfIsland(grid, i -1, j, visited) + areaOfIsland(grid, i, j -1, visited) + areaOfIsland(grid, i, j +1, visited);
            return area;

        }


    public static void main(String[] args){
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        Solution solution = new Solution();
        solution.maxAreaOfIsland(grid);
        System.out.println();

    }



    }

