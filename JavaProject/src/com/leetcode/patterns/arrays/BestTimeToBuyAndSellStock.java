package com.leetcode.patterns.arrays;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		
		int[] price = {7, 1, 5, 3, 6, 4};
		
		int result = maxProfit(price);
		
		System.out.println("Result : "+result);
	}

	private static int maxProfit(int[] price) {
		
		if(price == null || price.length == 0) return 0;
		
		int profit = 0;
		
		int min = price[0];
		
		int max = 0;
		
		for(int stockPrice : price)
		{
			min = Math.min(min, stockPrice);
			profit = stockPrice - min;
			max = Math.max(profit, max);
		}
		
		return max;
	}
}
