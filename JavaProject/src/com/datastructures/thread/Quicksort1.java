package com.datastructures.thread;

import java.util.Arrays;

public class Quicksort1 {

	static int partition(int array[], int leftmost, int rightmost) {

		// leftmost element as pivot
		int pivot = array[rightmost];

		// pointer for greater element
		int i = (leftmost - 1);
		// compare each element with pivot
		for (int j = leftmost; j < rightmost; j++) {
			if (array[j] <= pivot) {
				// If element found is smaller than pivot
				// it will be swapped with the larger element pointed by i
				i++;
				// element at i is swapped with element at j
				int s = array[i];
				array[i] = array[j];
				array[j] = s;
			}
		}
		// swapt the pivot element with the greater element specified by i
		int s = array[i + 1];
		array[i + 1] = array[rightmost];
		array[rightmost] = s;
		// return the position from where partition is done
		return (i + 1);
	}

	static void quickSort(int array[], int leftmost, int rightmost) {
		if (leftmost < rightmost) {
			int pi = partition(array, leftmost, rightmost);

			// recursive call on the left of pivot
			quickSort(array, leftmost, pi - 1);
			// recursive call on the right of pivot
			quickSort(array, pi + 1, rightmost);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 5, 4, 6, 1, 0, 8, 3 };
		System.out.println("Unsorted Array");
		System.out.println(Arrays.toString(arr));
		int size = arr.length;
		Quicksort1.quickSort(arr, 0, size - 1);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(arr));
	}
}