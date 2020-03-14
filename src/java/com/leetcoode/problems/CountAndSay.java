package com.leetcoode.problems;

public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String res = "";
        String pre = countAndSay(n - 1);
        int i = 0, j = 0;
        int count = 0;
        while (j < pre.length()) {
            if (pre.charAt(i) == pre.charAt(j)) {
                count++;
            } else {
                res += String.valueOf(count) + pre.charAt(i);
                count = 1;
                i = j;
            }
            j++;
        }
        if (count > 0) {
            res += String.valueOf(count) + pre.charAt(i);
        }
        return res;
    }
}
