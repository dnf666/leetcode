package medium;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * created on 2020/2/2
 *
 * @author dailinfu
 */

public class 数组中的第K个最大元素 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
