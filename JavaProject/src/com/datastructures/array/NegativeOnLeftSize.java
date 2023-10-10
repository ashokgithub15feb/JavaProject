package com.datastructures.array;

import java.util.Arrays;

public class NegativeOnLeftSize {

	public static void main(String[] args) {

		int[] arr = { -6, 3, -8, 10, 5, -7, -9, 12, -4, 2 };

		moveNegativeOnLeftSize(arr);
	}

	private static void moveNegativeOnLeftSize(int[] arr) {
		System.out.println(Arrays.toString(arr));

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			while (arr[i] < 0) {
				i++;
			}

			while (arr[j] >= 0) {
				j--;
			}

			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
