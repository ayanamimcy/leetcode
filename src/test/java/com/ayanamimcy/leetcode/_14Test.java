package com.ayanamimcy.leetcode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.ayanamimcy.leetcode._14.Solution;

public class _14Test {

    Solution solution = new Solution();

    @Test
    public void test01() {
        
        String[] s = new String[]{"flower","flow","flight"};

        assertEquals("fl", solution.longestCommonPrefix(s));

    }

    @Test
    public void test02() {
        String[] s = new String[]{"dog","racecar","car"};
        assertEquals("", solution.longestCommonPrefix(s)); 
    }

}
