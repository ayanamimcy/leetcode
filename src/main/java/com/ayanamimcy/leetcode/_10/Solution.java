package com.ayanamimcy.leetcode._10;

public class Solution {
    public boolean isMatch(String s, String p) {

        if (p == null || p.length() == 0) return (s == null || s.length() == 0);

        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i=2; i<=p.length(); i++) {
            dp[0][i] = p.charAt(i-1) == '*' && dp[0][i-2];
        }

        for (int i = 1; i <= p.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {
                if (p.charAt(i - 1) == s.charAt(j - 1) || p.charAt(i - 1) == '.') {
                    dp[j][i] = dp[j-1][i-1];
                } else if (p.charAt(i - 1) == '*') {
                    dp[j][i] = dp[j][i-2] || ((s.charAt(j-1) == p.charAt(i-2) || p.charAt(i-2) == '.') && dp[j-1][i]);
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
