package simple;

/**
 * created on 2019-09-12
 *
 * @author dailinfu
 */


public class 回文数 {
    public boolean isPalindrome(int x) {
        String x1 = String.valueOf(x);
        StringBuilder x2 = new StringBuilder(x1);
        StringBuilder stringBuffer = x2.reverse();
        return stringBuffer.equals(x2);
    }
}
