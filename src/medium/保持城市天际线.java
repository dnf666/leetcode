package medium;

/**
 * created on 2019/11/17
 *
 * @author dailinfu
 */

public class 保持城市天际线 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int row[] = new int[grid.length];
        int col[] = new int[grid[0].length];
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] > row[i]) {
                    row[i] = grid[i][j];
                }
                if (grid[i][j] > col[j]) {
                    col[j] = grid[i][j];
                }
            }
        }
        int max = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (row[i] > col[j]) {
                    max = max + col[j] - grid[i][j];
                } else {
                    max = max + row[i] - grid[i][j];
                }
            }
        }
        return max;
    }
}
