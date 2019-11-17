package simple;

import java.util.Arrays;

/**
 * created on 2019/11/17
 *
 * @author dailinfu
 */

public class 分发饼干 {
    public int findContentChildren(int[] g, int[] s) {
        boolean result[] = new boolean[g.length];
        Arrays.fill(result, false);
        for (int i = 0; i < s.length; ++i) {
            int near = 0;
            int tem = -1;
            for (int j = 0; j < g.length; ++j) {
                if (s[i] == g[j] && result[j] == false) {
                    result[j] = true;
                    break;
                } else {
                    if (result[j] == false && g[j] < s[i] && g[j] > near) {
                        near = g[j];
                        tem = j;
                    }
                    if (j == g.length - 1 && tem != -1) {
                        result[tem] = true;
                    }
                }
            }
        }
        int result1 = 0;
        for (int j = 0; j < result.length; ++j) {
            if (result[j]) {
                result1++;
            }
        }
        return result1;
    }
}
