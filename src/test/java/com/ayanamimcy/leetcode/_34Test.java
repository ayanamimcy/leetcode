package com.ayanamimcy.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ayanamimcy.leetcode._34.Solution;

public class _34Test {

    Solution solution = new Solution();

    @Test
    public void test01() {
        int[] input = new int[] { 5, 7, 7, 8, 8, 10 };
        int[] result = solution.searchRange(input, 8);

        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    public void test02() {
        int[] input = new int[] { 5, 7, 7, 8, 8, 10 };
        int[] result = solution.searchRange(input, 6);

        assertEquals(-1, result[0]);
        assertEquals(-1, result[1]);
    }

    @Test
    public void test03() {
        int[] input = new int[] {};
        int[] result = solution.searchRange(input, 0);

        assertEquals(-1, result[0]);
        assertEquals(-1, result[1]);
    }
}
