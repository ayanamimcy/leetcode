package com.ayanamimcy.jianzhi._04二维数组中的查找;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) {

		Map<Integer, String> result = new HashMap<>();
		result.put(22, "22");
		result.put(11, "11");
		result.put(223, "223");
		result.put(224, "224");

		Set<Integer> keySet = result.keySet();
		Set<Integer> sortSet = new TreeSet<>(keySet);
		System.out.println(sortSet);

	}

}
