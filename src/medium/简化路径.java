package medium;

import java.util.Stack;

/**
 * created on 2020/2/2
 *
 * @author dailinfu
 */

public class 简化路径 {
    public static void main(String[] args) {
        simplifyPath("/home/");
    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        String[] list = path.split("/");
        for (String s : list) {
            if ((".".equals(s)) || ("".equals(s))) {
                continue;
            }
            if ((!stack.isEmpty()) && ("..".equals(s))) {
                stack.pop();
            } else if (!"..".equals(s)) {
                stack.push(s);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stack.size(); ++i) {
            stringBuilder.append("/");
            stringBuilder.append(stack.get(i));
        }
        return stringBuilder.toString();
    }
}
