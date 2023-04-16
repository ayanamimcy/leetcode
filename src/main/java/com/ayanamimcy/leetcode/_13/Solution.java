package com.ayanamimcy.leetcode._13;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;

        Map<Character, Integer> symbol = new HashMap<>();
        symbol.put('I', 1);
        symbol.put('V', 5);
        symbol.put('X', 10);
        symbol.put('L', 50);
        symbol.put('C', 100);
        symbol.put('D', 500);
        symbol.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int val1 = symbol.get(s.charAt(i));
            int val2 = 0;
            if (i + 1 < s.length()) {
                val2 = symbol.get(s.charAt(i + 1));
            }

            if (val1 < val2) {
                result = result + (val2 - val1);
                i += 1;
            } else {
                result = result + val1;
            }

        }

        return result;
    }
}
