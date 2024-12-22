package org.learning.assignment;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        System.out.println(obj.roman2Int("XXIVLMC"));
    }

    public int roman2Int(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int integerValue = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                integerValue -= m.get(s.charAt(i));
            } else {
                integerValue += m.get(s.charAt(i));
            }
        }

        return integerValue;
    }
}
