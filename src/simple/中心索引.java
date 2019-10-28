package simple;

/**
 * created on 2019/10/22
 *
 * @author dailinfu
 */

public class 中心索引 {
    public static void main(String[] args) {
        int nums[] = {1, 7, 3, 6, 5, 6};
        pivotIndex(nums);
    }

    public static int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            right = right + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                left = 0;
            } else {
                left = left + nums[i - 1];
            }
            right = right - nums[i];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
