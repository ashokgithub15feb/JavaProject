package com.datastructures.thread;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 3, 4, 5, 6, 8 };

		int binarySearch = binarySearch(arr, 0, arr.length - 1, 5);
		System.out.println("Middle Index: "+binarySearch);
	}

	private static int binarySearch(int[] arr, int low, int high, int k) {

		int mid;

		if (low <= high) {
			mid = (low + high) / 2;

			if (arr[mid] == k)
				return mid;

			else if (arr[mid] > k) {
				return binarySearch(arr, low, mid - 1, k);
			} else {
				return binarySearch(arr, mid + 1, high, k);
			}
		}
		return -1;
	}
}
