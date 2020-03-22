package com.leetcoode.problems;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int res = nums[0];
        for (int i = 0; i < len; i++) {
            map.putIfAbsent(nums[i], 0);
            int val = map.get(nums[i]);
            map.put(nums[i], ++val);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                res = key;
                break;
            }
        }
        return res;
    }

    // 位运算
    // 抑或 相同为0 不同为1 与0抑或即为本身
    public int singleNumber2(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int a = 0;
        for (int i = 0; i < len; i++) {
            a ^= nums[i];
        }
        return a;
    }
}
