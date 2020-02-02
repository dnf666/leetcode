package simple;

import java.util.Stack;

/**
 * created on 2019/11/24
 *
 * @author dailinfu
 */

public class 分割平衡字符串 {
    private int result;

    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int num = 0;
        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] == 'R') num++;
            else num--;
            if (num == 0) result++;
        }
        return result;
    }

}
