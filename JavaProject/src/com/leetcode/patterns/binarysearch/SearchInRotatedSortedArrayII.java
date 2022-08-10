package com.leetcode.patterns.binarysearch;

public class SearchInRotatedSortedArrayII {

	public static void main(String[] args) {
		
		//int[] arr = {4, 5, 6, 7, 8, 9, 10, 1, 2};
		//int target = 1;
		
		//int[] arr = {4, 5, 6, 7, 8, 9, 10, 1, 2};
		//int target = 3;
		
		//int[] arr = {6, 1, 1, 2, 3, 4, 5};
		//int target = 1;
		
//		int[] arr = {2,5,6,0,0,1,2};
//		int target = 0;
		
//		int[] arr = {2,5,6,0,0,1,2};
//		int target = 3;
//		int[] arr = {1,0,1,1,1};
//		int target = 0;
				
		int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
		int target = 2;
		
		boolean result = searchInRotatedSortedArray(arr, target);
		
		System.out.println("SearchInRotatedSortedArray Index is: "+result);
	}

	private static boolean searchInRotatedSortedArray(int[] arr, int target) {
		
        if((arr == null || arr.length == 0) && target == -1) return false;
        
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high)
		{
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target)
			{
				return true;
			}
			
			 if( (arr[low] == arr[mid]) && (arr[high] == arr[mid])) 
			 {
				 low++; 
				 high--;
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
			 else
			{
				// mid to high part is sorted
				if(target > arr[mid] && arr[high] >= target)
				{
					low = mid + 1;
				}
				else
				{
					high = mid - 1;
				}
			}
		}
		return false;
	}
}
