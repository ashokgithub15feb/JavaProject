package com.leetcode.patterns.arrays;

import java.util.Arrays;

public class MinMaxNumber_2 {

	public static void main(String[] args) {
		
		int[] arr = {2,1,4,35,6,7,55,3};
		
		System.out.println(Arrays.toString(arr));
		findMinMax(arr);
		
		
	}

	private static void findMinMax(int[] arr) {
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
//			if(arr[i] < min)
//				min = arr[i];
//			
//			if(arr[i] > max)
//				max = arr[i];
//			
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
			
		}
		
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
	}
}
