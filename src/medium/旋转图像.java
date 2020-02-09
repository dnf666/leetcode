package medium;

/**
 * created on 2020/2/5
 *
 * @author dailinfu
 */

public class 旋转图像 {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        // 转置
        for (int i = 0; i < length; ++i) {
            for (int j = i; j < length; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int j = 0; j < length; ++j) {
            for (int k = 0; k < length / 2; ++k) {
                int temp = matrix[j][k];
                matrix[j][k] = matrix[j][length - 1 - k];
                matrix[j][length - 1 - k] = temp;
            }
        }
    }
}
