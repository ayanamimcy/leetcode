package com.ayanamimcy.leetcode._28;

public class Solution {
    public int strStr(String haystack, String needle) {

        int j = 0;

        for (int i = 0; i < haystack.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                i = i - j;
                j = 0;
            }

            if (j == needle.length()) {
                return i - j + 1;
            }

        }
        return -1;
    }
}
