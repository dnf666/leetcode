package medium;

import sun.tools.jconsole.MaximizableInternalFrame;

/**
 * created on 2020/2/4
 *
 * @author dailinfu
 */

public class 盛最多水的容器 {
    public int maxArea(int[] height) {
        int i = 0; int j = height.length - 1;
        int result = 0;
        while (i < j) {
            if (height[i] < height[j]) {
                result = Math.max(result, (j - i) * height[i]);
            } else {
                result = Math.max(result, (j - i) * height[j]);
            }
        }
        return result;
    }
}
