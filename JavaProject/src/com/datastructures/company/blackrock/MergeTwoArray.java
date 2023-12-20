package com.datastructures.company.blackrock;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int[] a = {1, 3, 5, 7, 564,33,277,88};
		int[] b = {2, 4, 6, 8, 9, 76, 43, 76, 100, 200};
		int[] c = new int[a.length+b.length];
		
		merger(a, b, c);
		
	}

	private static void merger(int[] a, int[] b, int[] c) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		int m = a.length;
		int n = b.length;
		
		while(i < m && j < n) {
			
			if(a[i] > b[j]) {
				c[k++] = b[j++];
			}
			else {
				c[k++] = a[i++];
			}
		}
		
		while(i < m) {
			c[k++] = a[i++];
		}
		
		while( j < n) {
			c[k++] = b[j++];
		}
		System.out.println(Arrays.toString(c));
	}
}
