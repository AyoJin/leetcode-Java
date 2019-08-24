package problems;

public class ClimbingStairs {

    public int climbStairs(int n) {
        // f(n) = f(n-1) + f(n-2)
        if (n <= 2) {
            return n;
        }
        int c1 = 1, c2 = 2, res = 0;
        for (int i = 3; i <= n; i++) {
            // 只用记录前两个值
            res = c1 + c2;
            c1 = c2;
            c2 = res;
        }
        return res;
    }
}
