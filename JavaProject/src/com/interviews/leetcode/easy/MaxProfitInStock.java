package com.interviews.leetcode.easy;

public class MaxProfitInStock {

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };

		int result = maxProfit(prices);

		System.out.println("Result: " + result);
	}

	private static int maxProfit(int[] prices) {

		int min = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {

			if (prices[i] < min) {
				min = prices[i];
			}

			int currentProfit = prices[i] - min;
			if (currentProfit > maxProfit) {
				maxProfit = currentProfit;
			}
		}
		return maxProfit;
	}
}
