package leetcode_174;

public class Solution {
    public static int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] healths = new int[m][n];
        healths[m - 1][n - 1] =  1 - dungeon[m - 1][n - 1];
        healths[m - 1][n - 1] = healths[m - 1][n - 1] <= 0 ? 1 : healths[m - 1][n - 1];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    continue;
                } else {
                    int hpRight = j == n - 1 ? Integer.MAX_VALUE : healths[i][j + 1] - dungeon[i][j];
                    int hpUp = i == m - 1 ? Integer.MAX_VALUE : healths[i + 1][j] - dungeon[i][j];
                    int hp = Math.min(hpRight, hpUp);
                    healths[i][j] = hp <= 0 ? 1 : hp;
                }

            }
        }


            return healths[0][0];

        }

    public static void main(String[] args) {
        int[][] dungeon = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println(calculateMinimumHP(dungeon));
    }

}
