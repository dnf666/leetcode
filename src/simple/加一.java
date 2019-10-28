package simple;

/**
 * created on 2019/10/26
 *
 * @author dailinfu
 */
public class 加一 {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int result[] = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = 0;
        }
        return result;
    }
}
