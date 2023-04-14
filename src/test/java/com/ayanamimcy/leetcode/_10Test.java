package com.ayanamimcy.leetcode;

import com.ayanamimcy.leetcode._10.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class _10Test {

    Solution solution = new Solution();

    @Test
    public void test01() throws Exception {
        String s = "aa";
        String p = "a";
        assertEquals(false, solution.isMatch(s, p));
    }

    @Test
    public void test02() throws Exception {
        String s = "aa";
        String p = "a*";
        assertEquals(true, solution.isMatch(s, p));
    }

    @Test
    public void test03() throws Exception {
        String s = "ab";
        String p = ".*";
        assertEquals(true, solution.isMatch(s, p));
    }

}