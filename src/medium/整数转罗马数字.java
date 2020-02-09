package medium;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * created on 2020/2/6
 *
 * @author dailinfu
 */

public class 整数转罗马数字 {
    public String intToRoman(int num) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        StringBuilder s = new StringBuilder();
        while (!map.isEmpty()) {
            Map.Entry<Integer, String> integerStringEntry = map.pollLastEntry();
            Integer key = integerStringEntry.getKey();
            if (num / key != 0) {
                int count = num / key;
                num = num % key;
                for (int i = 0; i < count; ++i) {
                    s.append(integerStringEntry.getValue());
                }
            }
        }
        return s.toString();
    }
}
