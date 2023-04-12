package com.ayanamimcy.leetcode._05;

public class Solution {

    String result = "";
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);
            expand(s, i, i + 1);
        }
        return result;
    }

    public void expand(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        if (result.length() < (right - left - 1)) {
            result = s.substring(left + 1, right);
        }
    }
}
