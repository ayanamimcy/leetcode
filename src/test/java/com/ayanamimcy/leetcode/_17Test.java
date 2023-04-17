package com.ayanamimcy.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ayanamimcy.leetcode._17.Solution;

public class _17Test {

    Solution solution = new Solution();

    @Test
    public void test01() {
        String digits = "23";

        List<String> result = Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");

        assertEquals(result, solution.letterCombinations(digits));
    }

    @Test
    public void test02() {
        String digits = "";

        List<String> result = Arrays.asList();

        assertEquals(result, solution.letterCombinations(digits));
    }

    @Test
    public void test03() {
        String digits = "2";

        List<String> result = Arrays.asList("a","b","c");

        assertEquals(result, solution.letterCombinations(digits));
    }
}
