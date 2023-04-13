package com.ayanamimcy.leetcode._07;


public class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            // if result > Integer.MAX_VALUE then result / 10 > Integer.MAX_VALUE. result * 10 is overflow
            if (Math.abs(result) > Integer.MAX_VALUE / 10) return 0;
            result = result * 10 + x % 10;
            x = x / 10;
        }

        return result;
    }
}
