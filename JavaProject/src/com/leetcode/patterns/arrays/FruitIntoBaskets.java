package com.leetcode.patterns.arrays;

public class FruitIntoBaskets {

	   public static void main(String[] args) {
	        int[] fruits = {1,2,1};
	        System.out.println(totalFruit(fruits));//3
	    }
	    public static int totalFruit(int[] fruits) {
	        int lastFruit = -1;
	        int secondLastFruit = -1;
	        int lastFruitCount = 0;
	        int currentMax = 0;
	        int max = 0;
	        for (Integer fruit : fruits) {
	            if (fruit == lastFruit || fruit == secondLastFruit) {
	                currentMax += 1;
	            } else {
	                currentMax = lastFruitCount + 1;
	            }
	            if (fruit == lastFruit) {
	                lastFruitCount += 1;
	            } else {
	                lastFruitCount = 1;
	                secondLastFruit = lastFruit;
	                lastFruit = fruit;
	            }

	           /* if (fruit != lastFruit) {
	                secondLastFruit = lastFruit;
	                lastFruit = fruit;
	            }*/
	            max = Math.max(max, currentMax);
	        }
	        return max;
	    }
}
