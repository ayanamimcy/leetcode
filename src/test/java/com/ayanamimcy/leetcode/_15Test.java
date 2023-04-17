package com.ayanamimcy.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.ayanamimcy.leetcode._15.Solution;

public class _15Test {

    Solution solution = new Solution();

    @Test
    public void test01() {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(-1,-1,2));
        result.add(Arrays.asList(0,-1, 1));
        assertEquals(result, solution.threeSum(nums));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{0, 1, 1};
        List<List<Integer>> result = new ArrayList<>();
        assertEquals(result, solution.threeSum(nums));
    }

    @Test
    public void test03() {
        int[] nums = new int[]{0, 0, 0};
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(0, 0, 0));
        assertEquals(result, solution.threeSum(nums));
    }
}
