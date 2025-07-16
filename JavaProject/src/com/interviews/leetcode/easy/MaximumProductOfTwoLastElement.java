package com.interviews.leetcode.easy;

import java.util.Arrays;

public class MaximumProductOfTwoLastElement {

	public static void main(String[] args) {

		int[] arr = { 3,4,5,2 };

		int result = maximumProductOfTwoElement(arr);
		
		System.out.println("Result: "+result);
	}

	private static int maximumProductOfTwoElement(int[] arr) {

		Arrays.sort(arr);

		int firstMax = arr[arr.length - 1];
		int secondMax = arr[arr.length - 2];
		int product = (firstMax -1) * (secondMax-1);

		return product;
	}
}
