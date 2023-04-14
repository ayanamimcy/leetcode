package com.ayanamimcy.leetcode;

import com.ayanamimcy.leetcode._05.Solution;
import org.junit.Assert;
import org.junit.Test;

public class _05Test {

    Solution solution = new Solution();

    @Test
    public void testCase01 () throws Exception {
        String s = "babad";
        String result = solution.longestPalindrome(s);
        Assert.assertEquals(result, "bab");
    }

    @Test
    public void testCase02 () throws Exception {
        String s = "cbbd";
        String result = solution.longestPalindrome(s);
        Assert.assertEquals(result, "bb");
    }
}
