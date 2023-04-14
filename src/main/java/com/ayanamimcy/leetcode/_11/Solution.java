package com.ayanamimcy.leetcode._11;

public class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;
        while (i <= j - 1) {
            int area = (j - i) * Math.min(height[i], height[j]);
            max = Math.max(area, max);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
