package com.datastructures.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {8, 5, 7, 3, 2};
		int n = arr.length;
		System.out.println("Input: "+Arrays.toString(arr));
		bubbleSort(arr, n);
		System.out.println("Output: "+Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr, int n) {
		int swapped;
		
		for(int i=0; i < n-1; i++) {
			swapped = 0;
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					//Swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = 1;
				}
			}
			if(swapped == 0) {
				break;
			}
		}
	}
}
