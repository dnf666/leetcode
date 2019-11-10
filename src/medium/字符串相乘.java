package medium;

/**
 * created on 2019/11/10
 *
 * @author dailinfu
 */

public class 字符串相乘 {
    public static void main(String[] args) {
        multiply("123", "456");
    }

    public static String multiply(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        int[] chars3 = new int[num1.length() + num2.length()];
        int temp = 0;
        for (int i = chars1.length - 1; i >= 0; i--) {
            for (int j = chars2.length - 1; j >= 0; j--) {
                int c1 = chars1[i] - '0';
                int c2 = chars2[j] - '0';
                int result = c1 * c2;
                result += chars3[i + j + 1];
                chars3[i + j] += result / 10;
                chars3[i + j + 1] = result % 10;
            }
        }
        boolean start = true;
        for (int i = 0; i < chars3.length; i++) {
            if (chars3[i] == 0 && start) {
                continue;
            }
            start = false;
            stringBuilder.append(chars3[i]);
        }
        return stringBuilder.toString();
    }
}
