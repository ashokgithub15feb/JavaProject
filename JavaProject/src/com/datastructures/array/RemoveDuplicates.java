package com.datastructures.array;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2};
		
		removeDuplicates(arr, arr.length);
	}

	private static void removeDuplicates(int[] arr, int length) {
		
		int[] temp = new int[arr.length];
		int j = 0;
		
		for(int i=0; i<length-1; i++) {
			if(arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		
		temp[j++] = arr[length-1];
		
		System.out.println(Arrays.toString(temp));
	}
}
