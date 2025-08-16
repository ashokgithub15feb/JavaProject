package com.interviews.companies.infosis;

import java.util.Arrays;

public class SortAllZeroOne {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 0, 0, 1, 0, 1, 0, 1 };
		System.out.println(Arrays.toString(arr));
		sortAllOneAndZero(arr);
	}

	private static void sortAllOneAndZero(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
