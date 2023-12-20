package com.leetcode.patterns.arrays;

import java.util.Arrays;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 3, 5, 7};
		int[] arr2 = {0, 2, 6, 8, 9};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		int n = arr1.length;
		
		int i = 0;
		int j = 0;
		
		while(i < n)
		{
			if(arr1[i] > arr2[j])
			{
				int temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
				
				//check after swap arr2 is sorted?
				checkArray2Sorted(arr2);
				//System.out.println("========");
				//System.out.println(Arrays.toString(arr1));
				//System.out.println(Arrays.toString(arr2));
				//System.out.println("========");
			}
			i++;
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}

	private static void checkArray2Sorted(int[] arr2) {
		
		for(int i=1; i<arr2.length; i++)
		{
			if(arr2[i] < arr2[i-1])
			{
				int temp = arr2[i];
				arr2[i] = arr2[i-1];
				arr2[i-1] = temp;
			}
		}
 	}
}
