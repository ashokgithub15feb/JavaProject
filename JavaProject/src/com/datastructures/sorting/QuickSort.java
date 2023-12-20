package com.datastructures.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {50, 70, 60, 90, 40, 80, 10, 20, 30};
		System.out.println("Input: "+Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("Output: "+Arrays.toString(arr));
	}

	private static int partition(int[] arr, int l, int h) {
		
		int pivot = arr[h];
		int i = l - 1;
		
		for(int j = l; j <= h - 1; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = temp;
		
		return i+1;
	}
	
	public static void quickSort(int[] arr, int l, int h) {
		int j;
		if(l < h) {
			j = partition(arr, l, h);
			quickSort(arr, l, j-1);
			quickSort(arr, j+1, h);
		}
	}
}
