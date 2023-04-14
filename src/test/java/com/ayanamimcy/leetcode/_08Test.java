package com.ayanamimcy.leetcode;

import com.ayanamimcy.leetcode._08.Solution;
import org.junit.Assert;
import org.junit.Test;

public class _08Test {

    Solution solution = new Solution();

    @Test
    public void test01() throws Exception {
        String x = "42";
        int reverse = solution.myAtoi(x);
        Assert.assertEquals(reverse, 42);
    }

    @Test
    public void test02() throws Exception {
        String x = "   -42";
        int reverse = solution.myAtoi(x);
        Assert.assertEquals(reverse, -42);
    }

    @Test
    public void test03() throws Exception {
        String x = "4193 with words";
        int reverse = solution.myAtoi(x);
        Assert.assertEquals(reverse, 4193);
    }
}
