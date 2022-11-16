package com.ayanamimcy.leetcode._1894;

public class Solution {

    // 前纸假发 + 二叉搜索
    public int chalkReplacer(int[] chalk, int k) {
        int length = chalk.length;
        // 1. 计算一轮需要用多少粉笔，并通过求余计算出余数
        int[] sum = new int[length + 1];
        for (int i = 0; i < length; i++) {
            sum[i+1] = sum[i] + chalk[i];
        }
        k %= sum[length];


        int left = 0, right = length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (sum[mid + 1] > k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] chalk = new int[] {5,1,5};
        int k = 22;

        Solution solution = new Solution();
        System.out.println(solution.chalkReplacer(chalk, k));

        chalk = new int[] {3,4,1,2};
        k = 25;
        System.out.println(solution.chalkReplacer(chalk, k));
    }

}
