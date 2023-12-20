package com.datastructures.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 7, 3, 2 };
		int n = arr.length;
		System.out.println("Input: " + Arrays.toString(arr));
		insertionSort(arr, n);
		System.out.println("Output: " + Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr, int n) {
		
		int j = 0;
		int x = 0;
		
		for(int i=1 ; i < n ; i++) {
			j = i - 1;
			x = arr[i];
			
			while(j > -1 && arr[j] > x) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j + 1] = x;
		}
	}
}
