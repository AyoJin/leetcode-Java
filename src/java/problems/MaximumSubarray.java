package problems;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = maxSum > sum ? maxSum : sum;
            sum = sum < 0 ? 0 : sum;
        }
        return maxSum;
    }
}
