package simple;

import java.util.Stack;

/**
 * created on 2019-08-24
 *
 * @author dailinfu
 */

public class 整数反转 {
    public static void main(String[] args) {
        System.out.println(reverse(-132));
    }

    // 正数，负数，超过范围的数
    public static int reverse(int x) {
        if (Integer.MAX_VALUE < x || x< Integer.MIN_VALUE) {
            return 0;
        }
        String s = new Integer(x).toString();
        Stack<Character> stack = new Stack();
        int sign = 0;
        if (s.substring(0,1).equals("-")) {
            sign = 1;
            s = s.substring(1);
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()) {
            Character c = stack.pop();
            stringBuilder.append(c);

        }
        String result;
        if (sign == 1) {
            result = "-" + stringBuilder.toString();
        }else
        {
            result = stringBuilder.toString();
        }
        try {
            Integer in = Integer.parseInt(result);
            return in;
        }catch (Exception e){
            return 0;
        }
    }
}
