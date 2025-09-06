package com.interviews.companies.ebay;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		
		int[] num1 = {1,3,5,7,9};
		int[] num2 = {2,44, 77, 99};
		
		int[] result = mergeSortedArray(num1, num2);
		
		System.out.println(Arrays.toString(result));
	}

	private static int[] mergeSortedArray(int[] num1, int[] num2) {
		
		int m = num1.length - 1; 
		int n = num2.length - 1;
		
		int[] result = new int[m+n+2];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < m && j < n) {
			
			if(num1[i] < num2[j]) {
				result[k++] = num1[i++];
			} else {
				result[k++] = num2[j++];
			}
		}
		
		for( ; i <= m ; i ++) {
			result[k++] = num1[i];
		}
		
		for( ; j <= n ; j++) {
			result[k++] = num2[j];
		}
		
		return result;
	}
}
