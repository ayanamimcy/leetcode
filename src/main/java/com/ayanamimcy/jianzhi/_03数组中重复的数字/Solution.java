package com.ayanamimcy.jianzhi._03数组中重复的数字;

public class Solution {

	public static void main(String[] args) {
		int[] arr = new int[] { 6, 2, 3, 4, 5, 5, 1 };
		System.out.println(new Solution().solution(arr));
	}

	// 这里采用第三种解法来实现·
	public int solution(int[] list) {
		for (int i = 0; i < list.length; i++) {
			while (list[i] != i) {
				if (list[i] == list[list[i]])
					return list[i];
				swap(list, i, list[i]);
			}
		}
		return -1;
	}

	private void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}

}
