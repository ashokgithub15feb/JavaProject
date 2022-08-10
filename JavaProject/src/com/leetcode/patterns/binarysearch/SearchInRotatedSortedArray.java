package com.leetcode.patterns.binarysearch;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		
		//int[] arr = {4, 5, 6, 7, 8, 9, 10, 1, 2};
		//int target = 1;
		
		//int[] arr = {4, 5, 6, 7, 8, 9, 10, 1, 2};
		//int target = 3;
		
		int[] arr = {6, 1, 2, 3, 4, 5};
		int target = 1;
		
		int result = searchInRotatedSortedArray(arr, target);
		
		System.out.println("SearchInRotatedSortedArray Index is: "+result);
	}

	private static int searchInRotatedSortedArray(int[] arr, int target) {
		
        if((arr == null || arr.length == 0) && target == -1) return -1;
        
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high)
		{
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target)
			{
				return mid;
			}
			else if(arr[low] <= arr[mid])
			{
				// low to mid part is sorted
				if(target >= arr[low] && arr[mid] > target)
				{
					high = mid - 1;
				}
				else
				{
					low = mid + 1;
				}
			}
			else if(arr[mid] <= arr[high])
			{
				// mid to high part is sorted
				if(target > arr[mid] && arr[high] > target)
				{
					low = mid + 1;
				}
				else
				{
					high = mid - 1;
				}
			}
		}
		return -1;
	}
}
