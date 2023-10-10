package com.datastructures.array;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		
		int[] arr = {4, 8, 13, 16, 20, 25, 28, 33};
		
		int n = arr.length - 1;
		
		boolean isSorted = isArraySorted(arr, n);
		System.out.println(isSorted);
	}

	private static boolean isArraySorted(int[] arr, int n) {
		
		for(int i = 0; i < n ; i++) {
			if(arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
