package simple;

/**
 * created on 2019/10/25
 *
 * @author dailinfu
 */

public class 移动零 {
    public void moveZeroes(int[] nums) {
        int curIndex = nums.length - 1;
        int lastIndex = nums.length - 1;
        while (curIndex >= 0) {
            if (nums[curIndex] == 0) {
                int count = lastIndex - curIndex;
                for (int j = 0; j < count; j++) {
                    nums[curIndex + j] = nums[curIndex + j + 1];
                }
                nums[lastIndex] = 0;
                lastIndex--;
            }
            curIndex--;
        }
    }
}
