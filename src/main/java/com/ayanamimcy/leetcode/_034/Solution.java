package com.ayanamimcy.leetcode._034;

public class Solution {

	public int[] searchRange(int[] nums, int target) {
		int l = search(nums, target);
		int r = search(nums, target + 1);
		return l == r ? new int[] { -1, -1 } : new int[] { l, r - 1 };
	}

	// 二分查找算法
	private int search(int[] nums, int x) {

		int left = 0, right = nums.length;

		while (left < right) {
			int mid = (left + right) >>> 1;

			if (nums[mid] >= x) {
				right = mid;
			} else {
				left = mid + 1;
			}

		}

		return left;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] test = new int[] { 5, 7, 7, 8, 8, 10 };
		System.out.println(solution.searchRange(test, 8)[0] + solution.searchRange(test, 8)[1]);
	}
}
