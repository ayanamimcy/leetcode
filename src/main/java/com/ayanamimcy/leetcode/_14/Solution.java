package com.ayanamimcy.leetcode._14;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String min = strs[0];
        String max = strs[strs.length - 1];
        int index = 0;

        while (index < min.length() && index < max.length()) {
            if (min.charAt(index) == max.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return min.substring(0, index);
    }
}
