package simple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * created on 2019/9/22
 *
 * @author dailinfu
 */

public class 最长字符前缀 {
    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower","flow","flight"});
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        //找到最短string
        String shortest = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (shortest.length() > strs[i].length()) {
                shortest = strs[i];
            }
        }
        List<String> list = Arrays.asList(strs);
        for (int i = shortest.length(); i > 0; i--) {
            String prefix = shortest.substring(0, i);
            List<String> results = list.stream().filter(each -> !each.startsWith(prefix)).collect(Collectors.toList());
            if (results.isEmpty()) {
                return prefix;
            }
        }
        return "";
    }
}
