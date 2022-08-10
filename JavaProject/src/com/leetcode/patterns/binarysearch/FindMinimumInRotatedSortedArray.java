package com.leetcode.patterns.binarysearch;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {
		
		//int[] arr = {3,4,5,1,2};
		//int[] arr = {2, 3, 4, 5, 1};
		//int[] arr = {5, 1, 2, 3, 4};
		int[] arr = {4, 5, 6, 7, 8, 0, 1, 3};
		//int[] arr = {4, 5, 6, 7, 0, 1, 2};
		//int[] arr = {11,13,15,17};
		  //int[] arr = {11};
		
		System.out.println(Arrays.toString(arr));
		int result = findMinimumInRotatedSortedArray(arr);
		
		System.out.println("Minimum In Rotated Sorted Array: "+result);
		
		System.out.println("=============================================");
		
		int result1 = findMinimumInRotatedSortedArray1(arr);
		
		System.out.println("Minimum In Rotated Sorted Array: "+result1);
		
		
	}

	private static int findMinimumInRotatedSortedArray1(int[] arr) {
		
		int left = 0;
		int right = arr.length-1;
		
		while(left <= right)
		{
			int mid = left + (right - left)/2;
			
			if(arr[mid] > arr[right])
			{
				left = mid + 1;
			}
			else if(arr[mid] < arr[right])
			{
				right = mid;
			}
			else 
			{
				return arr[right];
			}
		}
		return arr[left];
	}

	private static int findMinimumInRotatedSortedArray(int[] arr) {
		
		int left = 0;
		int right = arr.length-1;
		
		if(arr[left] <= arr[right])
		{
			return arr[0];
		}
		
		while(left <= right)
		{
			int mid = left + (right - left)/2;
			
			if(arr[mid] > arr[mid + 1])
			{
				return arr[mid + 1];
			}
			else if(arr[mid] < arr[mid - 1])
			{
				return arr[mid];
			}
			else if(arr[left] <= arr[mid])
			{
				left = mid + 1;
			}
			else if(arr[mid] <= arr[right])
			{
				right = mid - 1;
			}
		}
		
		return -1;
	}
}








