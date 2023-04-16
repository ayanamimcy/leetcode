package com.ayanamimcy.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ayanamimcy.leetcode._13.Solution;

public class _13Test {

    Solution solution = new Solution();

    @Test
    public void test01() {
        String s = "III";
        assertEquals(3, solution.romanToInt(s));
    }

    @Test
    public void test02() {
        String s = "LVIII";
        assertEquals(58, solution.romanToInt(s));
    }

    @Test
    public void test03() {
        String s = "MCMXCIV";
        assertEquals(1994, solution.romanToInt(s));
    }
}
