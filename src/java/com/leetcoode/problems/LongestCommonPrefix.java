package com.leetcoode.problems;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        if (size == 0) {
            return "";
        }
        String minStr = "";
        int len = strs[0].length();
        for (String str : strs) {
            if (str.length() <= len) {
                len = str.length();
                minStr = str;
            }
        }
        int i = 0;
        for (; i < len; i++) {
            for (String str : strs) {
                if (str.charAt(i) != minStr.charAt(i)) {
                    return minStr.substring(0, i);
                }
            }
        }
        return minStr;
    }
}
