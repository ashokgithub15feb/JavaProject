package com.ds.heapsort;

public class HeapSortImpl {
	
	private static int N;
	
	public static void sort(int[] arr)
	{
		heapIfY(arr);
	}

	private static void heapIfY(int[] arr) {

		N = arr.length-1;
		
		for(int i=N/2; i>=0;i--)
		{
			maxHeap(arr, i);
		}
	}

	private static void maxHeap(int[] arr, int i) {
		
		
	}
}
