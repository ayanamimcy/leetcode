package com.ayanamimcy.leetcode._17;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    String[] maps = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return result;

        genResult(digits, "", 0);

        return result;

    }

    private void genResult(String digits, String res, int idx) {

        if (res.length() == digits.length()) {
            result.add(res);
            return;
        }

        String source = maps[(digits.charAt(idx) - '0')];

        for (int i = 0; i < source.length(); i++) {
            genResult(digits, res + source.charAt(i), idx + 1);
        }


    }

}
