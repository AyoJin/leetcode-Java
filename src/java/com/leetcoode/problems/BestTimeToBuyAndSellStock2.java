package com.leetcoode.problems;

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0) {
            return 0;
        }
        int maxProfit = 0;
        // 下跌之前卖出
        // 上涨之前买入
        int i = 0;
        int peekSum = 0;
        int vallySum = 0;
        while (i < len - 1) { // 这里必须是len - 1 不然会死循环
            // 这里必须是先买入 再卖出 所以先找波谷
            while (i < len - 1 && prices[i] > prices[i + 1]) {
                i++;
            }
            vallySum += prices[i];
            while (i < len - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            peekSum += prices[i];
        }
        return peekSum - vallySum > 0 ? peekSum - vallySum : 0;
    }
}
