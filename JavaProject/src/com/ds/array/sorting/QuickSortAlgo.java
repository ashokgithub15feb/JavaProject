package com.ds.array.sorting;

import java.util.Arrays;

public class QuickSortAlgo {

	public static void main(String[] args) {
		
		int[] arr = {10, 7, 8, 9, 1, 5};
		
		int n = arr.length-1;
		
		System.out.println(Arrays.toString(arr));
		
		sort(arr, 0, n);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr, int low, int high) {
		
		if(low < high)
		{
			int pi = partitionPosition(arr, low, high);
			
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}

	private static int partitionPosition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j=low; j<high; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
}
