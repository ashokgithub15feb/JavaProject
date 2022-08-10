package com.leetcode.patterns.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 7, -1 };
		int sum = 6;
		//int[] arr = { 1, 1, 1, 1 };
		//int sum = 2;

		System.out.println(Arrays.toString(arr));
		int result = countPairsWithGivenSum(arr, sum);

		System.out.println("CountPairsWithGivenSum: "+result);
	}

	private static int countPairsWithGivenSum(int[] arr, int sum) {

		Map<Integer, Integer> map = new HashMap<>();

		int count = 0;
		// ( a , b ) = sum
		for (int i = 0; i < arr.length; i++) {
			
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 0);
			}

			map.put(arr[i], map.get(arr[i]) + 1);
		}
		
		for(int i=0; i<arr.length; i++)
		{
			int a = arr[i];
			
			int b  = sum - a;
			
			
			if(map.get(b) != null)
			{
				count = count + map.get(b);
			}
			
			if(b == a)
			{
				count--;
			}
			
			System.out.println("Map: "+map+", | A: "+a+", | B: "+b+", | Sum: "+sum+", | Count: "+count);
			System.out.println("==================================================================");
		}
		return count/2;
	}
}
