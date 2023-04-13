package com.ayanamimcy;

import com.ayanamimcy.leetcode._07.Solution;
import org.junit.Assert;
import org.junit.Test;

public class _07Test {

    Solution solution = new Solution();

    @Test
    public void test01() throws Exception {
        int x = 123;
        int reverse = solution.reverse(x);
        Assert.assertEquals(reverse, 321);
    }

    @Test
    public void test02() throws Exception {
        int x = -123;
        int reverse = solution.reverse(x);
        Assert.assertEquals(reverse, -321);
    }

    @Test
    public void test03() throws Exception {
        int x = 120;
        int reverse = solution.reverse(x);
        Assert.assertEquals(reverse, 21);
    }
}
