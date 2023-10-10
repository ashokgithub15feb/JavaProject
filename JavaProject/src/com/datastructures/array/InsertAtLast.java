package com.datastructures.array;

import java.util.Arrays;

public class InsertAtLast {

	public static void main(String[] args) {
		int[] nums = { 8, 3, 7, 12, 6, 9, 10, 11, 15, 17 };
		int index = 10;
		int newElement = 40;

		insertAtLast(nums, index, newElement);
	}

	private static void insertAtLast(int[] nums, int index, int newElement) {

		System.out.println(Arrays.toString(nums));
		if(index >= 0 && index <= nums.length) {
			
			int[] temp = new int[nums.length+1];
			for(int i = 0; i < nums.length; i++) {
				temp[i] = nums[i];
			}
			
			temp[index] = newElement;
			
			System.out.println(Arrays.toString(temp));
		}
	}
}
