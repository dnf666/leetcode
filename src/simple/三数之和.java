package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created on 2019/10/2
 *
 * @author dailinfu
 */
public class 三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> ls = new ArrayList<>();
        //要求三数之和为0
        for (int i = 0; i < length - 2; i++) {
            // 可能会出现这种 {0,1,1,1,-1}
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {  // 跳过可能重复的答案

                int l = i + 1, r = length - 1, sum = 0 - nums[i];
                while (l < r) {
                    if (nums[l] + nums[r] == sum) {
                        ls.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r - 1]) {
                            r--;
                        }
                        l++;
                        r--;
                    } else if (nums[l] + nums[r] < sum) {
                        while (l < r && nums[l] == nums[l + 1]) {
                            l++;   // 跳过重复值
                        }
                        l++;
                    } else {
                        while (l < r && nums[r] == nums[r - 1]) {
                            r--;
                        }
                        r--;
                    }
                }
            }
        }
        return ls;
    }
}
