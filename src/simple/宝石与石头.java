package simple;

import java.util.HashSet;
import java.util.Set;

/**
 * created on 2019/11/17
 *
 * @author dailinfu
 */

public class 宝石与石头 {
    public int numJewelsInStones(String J, String S) {
        Set<Character> Jset = new HashSet();
        for (char j : J.toCharArray())
            Jset.add(j);

        int ans = 0;
        for (char s : S.toCharArray())
            if (Jset.contains(s)) {
                ans++;
            }
        return ans;
    }
}
