package simple;

import java.util.Arrays;
import java.util.List;

/**
 * created on 2019/11/10
 * @author dailinfu
 */


public class 搜索插入的位置 {
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num >= target){
                return i;
            }
        }
        return nums.length;
    }
}
