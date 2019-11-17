package medium;

/**
 * created on 2019/11/17
 *
 * @author dailinfu
 */

public class 加油站 {
    public static void main(String[] args) {
        canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2});
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int count = gas.length;
        for (int i = 0; i < count; ++i) {
            int remain = 0;
            boolean mark = false;
            for (int j = i; j < i + count; ++j) {
                if (j == count - 1) {
                    remain = remain + gas[j] - cost[j];
                    if (remain < 0) {
                        mark = true;
                        break;
                    }
                } else {
                    remain = remain + gas[j % count] - cost[j % count];
                    if (remain < 0) {
                        mark = true;
                        break;
                    }
                }
            }
            if (!mark) {
                return i;
            }
        }
        return -1;
    }
}
