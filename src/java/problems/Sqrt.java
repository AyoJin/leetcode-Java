package problems;

public class Sqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 0;
        int right = x / 2 + 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            int sqrt = x / mid;
            if (mid == sqrt) {
                return mid;
            }
            if (mid < sqrt) {
                left = mid + 1;
            }
            if (mid > sqrt) {
                right = mid - 1;
            }
        }
        return left - 1;
    }
}
