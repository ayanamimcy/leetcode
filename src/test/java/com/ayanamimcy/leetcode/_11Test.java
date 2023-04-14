package com.ayanamimcy.leetcode;

import com.ayanamimcy.leetcode._11.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class _11Test {

    Solution solution = new Solution();

    @Test
    public void test01() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(solution.maxArea(height), 49);
    }

    @Test
    public void test02() {
        int[] height = new int[]{1,1};
        assertEquals(solution.maxArea(height), 1);
    }

}