package com.leetcoode.problems;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return true;
        }
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && (s.charAt(l) == ' ' || !isAlphaNumeric(s.charAt(l)))) {
                l++;
            }
            while (l < r && (s.charAt(r) == ' ' || !isAlphaNumeric(s.charAt(r)))) {
                r--;
            }
            if (s.charAt(l) == s.charAt(r) ||
                    ((s.charAt(l) > 57 && s.charAt(r) > 57)
                            && (s.charAt(r) + 32 == s.charAt(l)
                            || s.charAt(l) + 32 == s.charAt(r)))) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        // 0 ~ 9 ascii码范围：48 ~ 57
        // A ~ Z ascii码范围：65 ~ 90
        // a ~ z ascii码范围：97 ~ 122
        if (c >= 48 && c <= 57) {
            return true;
        }
        if (c >= 65 && c <= 90) {
            return true;
        }
        if (c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }
}
