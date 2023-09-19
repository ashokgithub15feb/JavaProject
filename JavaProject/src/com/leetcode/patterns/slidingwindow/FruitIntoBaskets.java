package com.leetcode.patterns.slidingwindow;

public class FruitIntoBaskets {

	public static void main(String[] args) {
		
		//int[] tree = {0, 1, 2, 2};
		int[] tree = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
		
		int result = totalFruit(tree);
		
		System.out.println("The maximum number of fruits is: "+result);   //5
	}

	private static int totalFruit(int[] tree) {
		
		int firstBasketFruit = -1;
		int secondBasketFruit = -1;
		int lastFruitCount = 0;
		int currMax = 0;
		int max = 0;
		
		for(Integer fruit : tree)
		{
			if(fruit == firstBasketFruit || fruit == secondBasketFruit)
			{
				currMax++;
			}
			else
			{
				currMax = lastFruitCount + 1;
			}
			
			if(fruit == firstBasketFruit)
			{
				lastFruitCount++;
			}
			else
			{
				lastFruitCount = 1;
			}
			
			if(fruit != firstBasketFruit)
			{
				secondBasketFruit = firstBasketFruit;
				firstBasketFruit = fruit;
			}
			max = Math.max(currMax, max);
		}
		
		return max;
	}
}
