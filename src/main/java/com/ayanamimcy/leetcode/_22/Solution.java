package com.ayanamimcy.leetcode._22;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        caluate(0, 0, "", n, result);
		return result;
    }

    public void caluate(int left, int right, String str, int n, List<String> result) {

        if (str.length() == n * 2) {
            result.add(str);
            return;
        }

        if (left < n ) caluate(left + 1, right, str + "(", n, result);
        if (right < left) caluate(left, right + 1, str + ")", n, result);
    }
    
}
