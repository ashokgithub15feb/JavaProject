package com.datastructures.array;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int[] a = {3, 8, 16, 20, 25};
		int[] b = {4, 10, 12, 22, 23, 28, 30};
		int[] c = new int[a.length+b.length];
		
		mergeTwoArray(a, b, c);
		
		int[] a1 = {3, 5, 10, 4, 6};
		int[] b1 = {12, 4, 7, 2, 5};
		int[] c1 = new int[a.length+b.length];

		int[] a2 = {3, 4, 5, 6, 10};
		int[] b2 = {2, 4, 5, 7, 12};
		int[] c2 = new int[a.length+b.length];
		
		unionTwoUnSortedArray(a1, b1, c1);
		unionTwoSortedArray(a2, b2, c2);
		
		int[] a3 = {3, 4, 5, 6, 10};
		int[] b3 = {2, 4, 5, 7, 12};
		int[] c3 = new int[a.length+b.length];
		
		intersectionTwoUnSortedArray(a1, b1, c1);
		intersectionTwoSortedArray(a3, b3, c3);
		
		int[] a4 = {3, 4, 5, 6, 10};
		int[] b4 = {2, 4, 5, 7, 12};
		int[] c4 = new int[a.length+b.length];
		
		differenceTwoUnSortedArray(a1, b1, c1);
		differenceTwoSortedArray(a4, b4, c4);
	}

	private static void differenceTwoSortedArray(int[] a, int[] b, int[] c) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		int m = a.length;
		int n = b.length;
		
		while(i < m && j < n) {
			if(a[i] < b[j]) {
				c[k++] = a[i++];
			}
			else if(b[j] < a[i]) {
				j++;
			}
			else if(a[i] == b[j]) {
				i++;j++;
			}
		}
		
		for( ; i < m ; i++) {
			c[k++] = a[i];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("Difference of Two sorted Array: "+Arrays.toString(c));
	}

	private static void differenceTwoUnSortedArray(int[] a, int[] b, int[] c) {
		// TODO Auto-generated method stub
		
	}

	private static void intersectionTwoSortedArray(int[] a, int[] b, int[] c) {
		int i = 0;
		int j = 0;
		int k = 0;
		int m = a.length;
		int n = b.length;
		
		while(i < m && j < n) {
			if(a[i] < b[j]) {
				i++;
			}
			else if(b[j] < a[i]) {
				j++;
			}
			else if(a[i] == b[j]) {
				c[k++] = a[i++];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("Intersection of Two sorted Array: "+Arrays.toString(c));
	}

	private static void intersectionTwoUnSortedArray(int[] a, int[] b, int[] c) {
		// TODO Auto-generated method stub
		
	}

	private static void unionTwoUnSortedArray(int[] a, int[] b, int[] c) {
		// TODO Auto-generated method stub
		
	}

	private static void unionTwoSortedArray(int[] a1, int[] b1, int[] c1) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		int m = a1.length;
		int n = b1.length;
		
		while(i < m && j < n) {
			//if element is same then should take only one copy and increment in the both the array
			if(a1[i] < b1[j]) {
				c1[k++] = a1[i++];
			}
			else if(b1[j] < a1[i]) {
				c1[k++] = b1[j++];
			}
			else {
				c1[k++] = a1[i++];
				j++;
			}
		}
		
		for( ; i < m ; i++) {
			c1[k++] = a1[i++];
		}
		
		for( ; j < n ; j++) {
			c1[k++] = b1[j++];
		}
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(b1));
		System.out.println("Union of Two sorted Array: "+Arrays.toString(c1));
		
	}

	private static void mergeTwoArray(int[] a, int[] b, int[] c) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		int m = a.length;
		int n = b.length;
		
		while(i < m && j < n) {
			
			if(a[i] < b[j]) {
				c[k++] = a[i++];
			}
			else {
				c[k++] = b[j++];
			}
		}
		
		for( ; i < m ; i++) {
			c[k++] = a[i++];
		}
		
		for( ; j < n ; j++) {
			c[k++] = b[j++];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("Merge Two sorted Array: "+Arrays.toString(c));
	}
}
