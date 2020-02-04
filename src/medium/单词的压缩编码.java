package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * created on 2020/2/4
 *
 * @author dailinfu
 */

public class 单词的压缩编码 {
    public int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        for (int i = 0; i < words.length; ++i) {
            String word = words[i];
            for (int j = 1; j < word.length(); ++j) {
                set.remove(word.substring(j));
            }
        }
        int result = 0;
        for (String entry : set) {
            result += entry.length();
        }
        return result + set.size();
    }
}
