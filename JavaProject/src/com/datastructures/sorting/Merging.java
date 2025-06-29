package com.datastructures.sorting;

import java.util.Arrays;

public class Merging {

	public static void main(String[] args) {
		
		int[] a = {2, 10, 18, 20, 23};
		int[] b = {4, 9, 19, 25};
		int m = a.length;
		int n = b.length;
		
		merge(a, b, m, n);
		
	}

	private static void merge(int[] a, int[] b, int m, int n) {
		
		System.out.println("Input: "+Arrays.toString(a));
		System.out.println("Input: "+Arrays.toString(b));
		
		
		int[] c = new int[m+n];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < m && j < n) {
			if(a[i] < b[j]) {
				c[k++] = a[i++];
			}
			else {
				c[k++] = b[j++];
			}
		}
		
		for( ; i < m ; ) {
			c[k++] = a[i++];
		}
		
		for( ; j < n ;) {
			c[k++] = b[j++];
		}
		
		
		System.out.println("Output: "+Arrays.toString(c));
		
	}
}
