package com.leetcode.patterns.binarysearch;

public class PeakIndexInMountainArray {

	public static void main(String[] args) {
		
		int[] arr = {0,10,20,30, 40,50,40,30,20,10, 5, 4,3,0};
		
		int result = peakIndexInMountainArray(arr);
		System.out.println("PeakIndexInMountainArray: "+result);
	}

	private static int peakIndexInMountainArray(int[] arr) {
		
		int left = 0;
		int right = arr.length-1;
		int ans = -1;
		
		while(left < right)
		{
			int m = left + (right - left)/2;
			
			if(arr[m] > arr[m + 1])
			{
				ans = m;
				right = m;
			}
			else
			{
				ans = m + 1;
				left = m + 1;
			}
		}
		
		return ans;
	}
}
