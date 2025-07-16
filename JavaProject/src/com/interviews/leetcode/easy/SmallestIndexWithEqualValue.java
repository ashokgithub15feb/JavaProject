package com.interviews.leetcode.easy;

public class SmallestIndexWithEqualValue {

	public static void main(String[] args) {

		//int[] arr = { 0, 1, 2 };
		/*
		 * i = 0; 0 mod 10 = arr[0]
		 * i = 1; 1 mod 10 = arr[1]
		 * i = 2; 2 mod 10 = arr[2]
		 * 
		 * return the index for above index is 0
		 */
		
		int[] arr = { 4, 3, 2, 1 };
		/*
		 * i = 0; 4 mod 10 = 4 != arr[0]
		 * i = 1; 3 mod 10 = 2 != arr[1]
		 * i = 2; 2 mod 10 = 2 == arr[2]
		 * i = 3; 1 mod 10 = 3 != arr[3]
		 * 
		 * return the index for above index is 2
		 */
		
		
		int result = smallestIndexWithEqualValue(arr);
		
		System.out.println("Result: "+result);
	}

	private static int smallestIndexWithEqualValue(int[] arr) {

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 10 == arr[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
}
