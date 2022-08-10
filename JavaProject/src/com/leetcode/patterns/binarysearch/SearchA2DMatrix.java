package com.leetcode.patterns.binarysearch;

public class SearchA2DMatrix {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,3,5,7,9}, {10,20,25,29,34}, {38,40,44,49,53},{60,61,65,68,74} ,{78,80,85,90,92}};
		int target = 78;
		
		boolean result = search(matrix, target);
		
		System.out.println("Search: "+target+" in 2D Matrix: "+result);
	}

	private static boolean search(int[][] matrix, int target) {
		
		int row = binarySearchRowSelection(matrix, target);
		
		if(row == -1)
		{
			return false;
		}
		
		boolean isFound = binarySearch(matrix, target, row);
		
		return isFound;
	}

	private static boolean binarySearch(int[][] matrix, int target, int row) {
		
		int low = 0;
		int high = matrix[0].length-1;
		
		while(low <= high)
		{
			int mid = low + (high - low)/2;
			
			if(matrix[row][mid] == target)
			{
				return true;
			}
			
			else if(matrix[row][mid] < target)
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
		return false;
	}

	private static int binarySearchRowSelection(int[][] matrix, int target) {
		
		int low = 0;
		int high = matrix.length-1;
		int lc = matrix[0].length-1;
		
		while(low <= high)
		{
			int mid = low + (high - low)/2;
			
			if(matrix[mid][0] <= target && target <= matrix[mid][lc])
			{
				return mid;
			}
			else if(matrix[mid][0] < target)
			{
				low = mid + 1;
			}
			else if(matrix[mid][0] > target)
			{
				high = mid - 1;
			}
		}
		
		return -1;
	}
}
