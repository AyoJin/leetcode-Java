package problems;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0) {
            if (digits[i] == 9) {
                digits[i] = 0;
                i--;
            } else {
                digits[i]++;
                return digits;
            }
        }
        if (i == -1) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;// 这里直接返回即可，因为数组初始化的时候，所有元素都是0
    }
}
