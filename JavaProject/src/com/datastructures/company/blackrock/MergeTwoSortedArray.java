package com.datastructures.company.blackrock;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 3, 5, 7};
		int[] arr2 = {2, 4, 6, 8, 9};
		int[] result = new int[arr1.length+arr2.length];
		
		result = merge(arr1, arr2, result);
		
		
		System.out.println(Arrays.toString(result));
		
	}

	private static int[] merge(int[] arr1, int[] arr2, int[] result) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		int m = arr1.length;
		int n = arr2.length;
		
		while(i < m && j < n) {
			
			if(arr1[i] < arr2[j]) {
				result[k++] = arr1[i++];
			}
			else {
				result[k++] = arr2[j++];
			}
		}
		
		while(i < m) {
			result[k++] = arr1[i++];
		}
		
		while(j < n) {
			result[k++] = arr2[j++];
		}
		return result;
	}
}
