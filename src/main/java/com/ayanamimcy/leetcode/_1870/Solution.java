package com.ayanamimcy.leetcode._1870;

/**
 * 可以使用二分法来计算
 */
public class Solution {

    public int minSpeedOnTime(int[] dist, double hour) {
        // 使用二分法来计算出最小速度
        int left = 1, right = (int) 1e7;

        while (left < right) {
            int mid = (left + right) >> 1;

            if (check(dist, mid, hour)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return check(dist, left, hour) ? left : -1;
    }

    private boolean check(int[] dist, int speed, double hour) {
        double res = 0;

        for (int i = 0; i < dist.length; i++) {
            double result = dist[i] * 1.0 / speed;
            res += (i == dist.length - 1 ? result : Math.ceil(result));
        }
        return res <= hour;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] dist = new int[]{1,3,2};
        double hour = 1.9;

        System.out.println(solution.minSpeedOnTime(dist, hour));

        dist = new int[]{1,3,2};
        hour = 2.7;

        System.out.println(solution.minSpeedOnTime(dist, hour));
    }


}
