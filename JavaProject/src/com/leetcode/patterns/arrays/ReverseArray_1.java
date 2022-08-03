package com.leetcode.patterns.arrays;

import java.util.Arrays;

public class ReverseArray_1 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		reverseArray(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr1 = {1, 2, 3, 4, 5, 40, 030, 23,11};
		
		reverseArrayUsingRecursion(arr1, 0, arr1.length-1);
		
		System.out.println(Arrays.toString(arr1));
		
		
		int[] arr11 = {1, 2, 3, 4, 5, 40, 030, 23,11};
		
		for(int i=arr11.length-1; i>=0; i--)
		{
			System.out.println(arr11[i]);
		}
		
	}

	private static void reverseArrayUsingRecursion(int[] arr, int start, int end) {
		
		if(start > end) 
			return;
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		reverseArrayUsingRecursion(arr, start+1, end-1);
	}

	private static void reverseArray(int[] arr) {
		
		int n = arr.length;
		
		for(int i=0; i<n/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
	}
}
