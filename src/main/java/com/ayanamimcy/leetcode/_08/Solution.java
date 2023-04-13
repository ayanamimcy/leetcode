package com.ayanamimcy.leetcode._08;

public class Solution {
    public int myAtoi(String s) {
        int result = 0;
        int sign = 1;
        int index = 0;

        if (s == null || s.length() == 0) {
            return 0;
        }

        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        if (index < s.length()) {
            if (s.charAt(index) == '+') {
                sign = 1;
                index++;
            } else if (s.charAt(index) == '-') {
                sign = -1;
                index++;
            }
        }


        while (index < s.length() && (s.charAt(index) <= '9' && s.charAt(index) >= '0')){
            if (Math.abs(result) > Integer.MAX_VALUE / 10 || (Math.abs(result) >= Integer.MAX_VALUE / 10 && (s.charAt(index) - '0') > 7)) {
                if (sign == -1) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            };
            result = result * 10 + (s.charAt(index) - '0');
            index++;
        }
        return result * sign;
    }
}