package com.ds.thread;

import java.util.Arrays;

public class SubArray {

	static int left = 0;
	static int right = 0;
	static int indexmin = 0;
	static int indexmax = 0;

	public static void main(String[] args) {

		int[] arr = { 1, 4, 20, 3, 10, 5 };

		int sum = 33;

		int currentSum = 0;

		for (int i = 0; i <= arr.length + 1; i++) {
			if (currentSum == sum) {
				System.out.println(Arrays.toString(arr));
				System.out.println("currentSum: " + currentSum + ", sum: " + sum);
				System.out.println("Index from: " + indexmin + " to " + indexmax + " is sum of sub array");

				break;
			}

			else if (currentSum < sum) {

				currentSum = currentSum + arr[right];
				right = right + 1;
				indexmax++;

				if (currentSum > sum) {
					indexmax--;
				}

			} else if (currentSum > sum) {
				indexmin++;
				currentSum = currentSum - arr[left];
				left = left + 1;
			}
		}
	}
}
