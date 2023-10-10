package com.datastructures.array;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = { 4, 8, 10, 15, 18, 21, 24, 29, 33, 34, 37, 39, 41, 43 };
		int key = 39;

		int result = binarySearch(nums, key);
		System.out.println(result);
		
		
		int low = 0;
		int high = nums.length - 1;
		int result1 = recursionBinarySearch(nums, key, low, high);
		System.out.println(result1);
	}

	private static int binarySearch(int[] nums, int key) {

		int low = 0;
		int high = nums.length - 1;
		int mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;

			if (nums[mid] == key) {
				return mid;
			} else if (nums[mid] > key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	private static int recursionBinarySearch(int[] nums, int key, int low, int high) {

		int mid;

		if (low <= high) {
			mid = (low + high) / 2;

			if (nums[mid] == key) {
				return mid;
			} else if (nums[mid] > key) {
				return recursionBinarySearch(nums, key, low, mid - 1);
			} else {
				return recursionBinarySearch(nums, key, mid + 1, high);
			}
		}
		return -1;
	}
}
