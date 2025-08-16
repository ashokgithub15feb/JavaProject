package com.interviews.leetcode.medium;

import java.util.Arrays;

public class RotateArray11 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		
		System.out.println("Input: "+Arrays.toString(arr));
		rotateArray(arr, k);
		System.out.println("Output: "+Arrays.toString(arr));
	}

	private static void rotateArray(int[] arr, int k) {
		for(int i=0; i<k ; i++) {
			rotateArrayByOne(arr, arr.length - 1);
		}
	}

	private static void rotateArrayByOne(int[] arr, int len) {
		int start = 0;
		while(start < len) {
			int temp = arr[start];
			arr[start] = arr[start + 1];
			arr[start + 1] = temp;
			start++;
			System.out.println(Arrays.toString(arr));
		}
	}
}
