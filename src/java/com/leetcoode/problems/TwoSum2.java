package com.leetcoode.problems;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        long sum;
        while (left < right) {
            sum = numbers[left] + numbers[right];
            if(sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
               break;
            }
        }
        return new int[]{left + 1, right + 1};
    }
}
