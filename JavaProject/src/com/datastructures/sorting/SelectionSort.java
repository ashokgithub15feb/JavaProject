package com.datastructures.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 7, 3, 2 };
		int n = arr.length;
		System.out.println("Input: " + Arrays.toString(arr));
		selectionSort(arr, n);
		System.out.println("Output: " + Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr, int n) {
		
		int k = 0;
		
		for(int i = 0; i < n ; i++) {
			for(int j = k = i; j < n; j++) {
				if(arr[j] < arr[k]) {
					k = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
	}
}
