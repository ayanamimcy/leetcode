package com.ayanamimcy.leetcode._34;

public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int start = binarySearch(nums, target);
        int end = binarySearch(nums, target + 1);
        return start == end ? new int[] {-1, -1} : new int[] {start, end - 1};
    }

    public int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

}
