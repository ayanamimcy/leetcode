package com.ayanamimcy.basic.arrays;

/**
 * 最基本的数组的用法 1. 声明一个数组 2. 使用一个数组
 * 
 * @author chenyangm
 *
 */
public class SimpleArrayUsed {

	public static void main(String[] args) {
		int[] arr = new int[20];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}

}
