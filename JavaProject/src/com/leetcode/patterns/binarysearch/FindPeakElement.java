package com.leetcode.patterns.binarysearch;

public class FindPeakElement {

	public static void main(String[] args) {
		
		//int[] arr = {1,2,3,2,1};
		
		//int[] arr = {1,2,3,1};
		
		//int[] arr = {1,2,1,3,5,6,4};
		
		//int[] arr = {1,2};
		
		int[] arr = {1};
		
		int result = findPeakElement(arr);
		
		System.out.println(result);
	}

	private static int findPeakElement(int[] arr) {
		
		if(arr == null || arr.length == 0) return -1;
		
		int left = 0;
		int right = arr.length-1;
		
		while(left <= right)
		{
			int mid = left + (right - left)/2;
			
			if((mid == 0 || arr[mid] > arr[mid - 1]) &&
					(mid == arr.length -1 || arr[mid] > arr[mid + 1]))
			{
				return mid;
			}
			
			if(arr[mid] > arr[mid+1])
			{
				right = mid;
			}
			else
			{
				left = mid + 1;
			}
		}
		return left;
	}
}
