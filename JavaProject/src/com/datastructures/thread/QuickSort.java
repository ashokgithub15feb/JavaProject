package com.datastructures.thread;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {5, 4, 6, 1, 0, 8, 3};
		
		int leftmost = 0;
		int rightmost = arr.length-1;
		System.out.println(Arrays.toString(arr));
		
		quickSort(arr, leftmost, rightmost);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int leftmost, int rightmost) {
		
		if(leftmost < rightmost) {
			int pi = partition(arr, leftmost, rightmost);
			
			quickSort(arr, leftmost, pi - 1);
			quickSort(arr, pi + 1, rightmost);
		}
	}

	private static int partition(int[] arr, int leftmost, int rightmost) {
		
		int pivot = arr[rightmost];
		
		int i = (leftmost - 1);
		
		for(int j = leftmost; j < rightmost; j++) {
			if(arr[j] <= pivot) {
				i++;
				int s = arr[i];
				arr[i] = arr[j];
				arr[j] = s;
			}
		}
		
		int s = arr[i+1];
		arr[i+1] = arr[rightmost];
		arr[rightmost] = s;
		return (i+1);
	}
}

