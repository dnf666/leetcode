package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * created on 2019-08-12
 *Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * @author dailinfu
 */


public class TheLongestSubString {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!set.add(s.charAt(j))){
                    break;
                }
            }
            if (set.size()>max){
                max = set.size();
            }
            set.clear();
        }
        return max;
    }
}
