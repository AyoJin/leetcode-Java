package problems;

public class ImplementStr {
    public int strStr(String haystack, String needle) {
        int len1 = haystack != null ? haystack.length() : -1;
        int len2 = needle != null ? needle.length() : -1;
        if (len2 == 0) {
            return 0;
        }
        int res = -1;
        for (int i = 0; i <= len1 - len2; i++) {
            int j = 0;
            while (j < len2) {
                if (haystack.charAt(i + j) == needle.charAt(j)) {
                    if (++j == len2) {
                        return i;
                    }
                } else {
                    break;
                }
            }
        }
        return res;
    }
}
