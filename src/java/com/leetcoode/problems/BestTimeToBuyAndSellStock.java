package com.leetcoode.problems;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < len; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            } else if (maxProfit < prices[i] - minPrice) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
