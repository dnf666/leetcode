package simple;

/**
 * created on 2019/11/3
 *
 * @author dailinfu
 */

public class 验证回文串 {

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= '0' && chars[i] <= '9') || (chars[i] >= 'a' && chars[i] <= 'z')) {
                stringBuilder.append(chars[i]);
            }
        }
        String s3 = stringBuilder.toString();
        String s2 = stringBuilder.reverse().toString();
        return s3.equals(s2);
    }
}
