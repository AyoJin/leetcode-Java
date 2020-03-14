package com.leetcoode.problems;

/**
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        int res = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (i - 1 >= 0) {
                if (getSingleValue(s.charAt(i)) <= getSingleValue(s.charAt(i - 1))) {
                    res += getSingleValue(s.charAt(i));
                } else {
                    res += getSingleValue(s.charAt(i)) - getSingleValue(s.charAt(i - 1));
                    i--;
                }
            } else {
                res += getSingleValue(s.charAt(i));
            }
        }
        return res;
    }
    private int getSingleValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}
