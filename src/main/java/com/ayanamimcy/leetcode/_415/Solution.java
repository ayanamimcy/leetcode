package com.ayanamimcy.leetcode._415;

public class Solution {

    // 快速加法
    public String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder();
        // 从最高位开始计算
        int i = num1.length() - 1, j = num2.length() - 1, index = 0;
        // 遍历string字符串
        do {
            // 1. 计算值
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            index += (x + y);
            builder.append(index % 10);
            index /= 10;
            i--;
            j--;
        } while (i >= 0 || j >= 0);

        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "456", num2 = "77";
        Solution solution = new Solution();
        System.out.println(solution.addStrings(num1, num2));
    }

}
