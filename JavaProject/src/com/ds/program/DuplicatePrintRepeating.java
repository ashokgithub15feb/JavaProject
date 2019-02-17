package com.ds.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicatePrintRepeating {

	public static void m1(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int index = arr[i] % n;
			arr[index] += n;
		}

		// Now check which value exists more
		// than once by dividing with the size
		// of array
		for (int i = 0; i < n; i++) {
			if ((arr[i] / n) > 1)
				System.out.print(i + " ");
		}
	}

	// Driver's code
	public static void main(String args[]) {
		int arr[] = new int[101];
		for(int i=0; i<=100; i++)
		{
			arr[i] = i;
		}

		int arr_size = arr.length;

		System.out.print("The repeating elements are: ");
		m1(arr, arr_size);
	}
}
