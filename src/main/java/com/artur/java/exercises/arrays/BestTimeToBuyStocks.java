package com.artur.java.exercises.arrays;

/**
 * From: <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <br>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <br>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <br>
 * Example 1:
 * <br>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 * <br>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class BestTimeToBuyStocks {
    public static int maxProfit(int[] prices) {
        return optimalSolution(prices);
    }

    /**
     * This solutions is better than the first as it avoids iterating thought the 2nd array always.
     * Just when the buyValue is smaller. It could be better, with just one array.
     */
    private static int optimalSolution(int[] prices) {

        int resp = 0; // no profit, we have 0
        int buyValBuffer = Integer.MAX_VALUE;
        for (int buy = 0; buy < prices.length - 1; buy++) {
            int buyVal = prices[buy];

            if (buyVal >= buyValBuffer || buyVal >= prices[buy + 1]) {
                continue;
            }

            for (int sell = buy + 1; sell < prices.length; sell++) {
                int sellVal = prices[sell];

                int diff = sellVal - buyVal;
                if (diff > resp) {
                    resp = diff;
                    buyValBuffer = buyVal;
                }
            }
        }
        return resp;

    }

    private static int nonOptimalSolution(int[] prices) {
        int profit = 0;

        for (int buyDay = 0; buyDay < prices.length - 1; buyDay++) {
            int stockBuy = prices[buyDay];
            for (int sellDay = buyDay + 1; sellDay < prices.length; sellDay++) {
                int stockSell = prices[sellDay];
                int diff = stockSell - stockBuy;
                if (profit < diff) {
                    profit = diff;
                }
            }
        }
        return profit;
    }

}
