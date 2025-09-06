package com.interviews.coding;

import java.util.Arrays;

public class MergeInSingleArray {

	public static void main(String[] args) {
		
		int[] a = { 2, 5, 8, 2, 3, 6, 7, 10 };

		int low = 0;
		int high = a.length-1;
		int mid = low + (high - low) / 2;

		System.out.println(Arrays.toString(a));
		mergeInSingleArray(a, low, mid, high);
	}

	private static void mergeInSingleArray(int[] a, int low, int mid, int high) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] b = new int[high+1];
		
		i = low;
		j = mid + 1;
		k = low;
		
		while(i <= mid && j <= high) {
			
			if(a[i] < a[j]) {
				b[k++] = a[i++]; 
			} else {
				b[k++] = b[j++];
			}
		}
		
		for(; i <=mid; i++) {
			b[k++] = a[i];
		}
		
		for(; j <= high; j++) {
			b[k++] = a[j];
		}
		
		System.out.println(Arrays.toString(b));
	}
}
