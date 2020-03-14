package com.leetcoode.problems;

public class AddBinary {
    public String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int i = lenA - 1, j = lenB - 1;
        int bonus = 0; // 进位
        String res = "";
        while (i >= 0 || j >= 0) {
            int va = i >= 0 ? a.charAt(i) - '0' : 0; // 没有了就当0算
            int vb = j >= 0 ? b.charAt(j) - '0' : 0;
            int vab = (va + vb + bonus) % 2;
            bonus = (va + vb + bonus) / 2;
            i--;
            j--;
            res = vab + res;
        }
        if (bonus > 0) {
            res = bonus + res;
        }
        return res;
    }
}
