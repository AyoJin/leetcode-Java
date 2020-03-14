package com.leetcoode.problems;

public class SearchInsertPosition {
    // 1. 基本解法
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int i = 0;
        while (i < len) {
            if (nums[i] >= target) {
                return i - 1 < 0 ? 0 : i;
            } else {
                i++;
            }
        }
        return len;
    }

    // 2. 二分查找
    public int searchInsertMid(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) >>> 1;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else if (target == nums[mid]) {
                return mid;
            }
        }
        return left;
    }
}
