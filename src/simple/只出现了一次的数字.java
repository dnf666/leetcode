package simple;
import	java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * created on 2019/10/27
 *
 * @author dailinfu
 */


public class 只出现了一次的数字 {
    public int singleNumber(int[] nums) {
        if (nums.length ==1){
            return nums [0];
        }
        Set<Integer> set = new HashSet<> ();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }
        Iterator<Integer> iterator = set.iterator();
        return iterator.next();
    }
}
