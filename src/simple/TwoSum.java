package simple;

import java.util.HashMap;
import java.util.Map;

/**
 * created on 2019-08-09
 *
 * @author dailinfu
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer integer = map.get(target - nums[i]);
            if (integer != null && integer != i) {
                result[0] = i;
                result[1] = integer;
                return result;
            }
        }
        return null;
    }
}
