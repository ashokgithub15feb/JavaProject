package com.datastructures.array;

import java.util.Arrays;

public class LeftShiftRotate {

	public static void main(String[] args) {

		int[] nums = { 6, 3, 8, 5, 9 };
		System.out.println("Before Rotate: "+Arrays.toString(nums));
		leftShiftRotate(nums);
		
		//rightShiftRotate(nums);
	}

	private static void leftShiftRotate(int[] nums) {

		int temp = 0;
		int i, j = 0;
		temp = nums[0];
		for (i = 0, j = 0; i < nums.length-1; i++, j++) {
			nums[i] = nums[j + 1];
		}
		nums[j] = temp;
		System.out.println("After Left Rotate: "+Arrays.toString(nums));
	}
	
	private static void rightShiftRotate(int[] nums) {

		int temp = 0;
		int i, j = 0;
		temp = nums[nums.length-1];
		for (i = nums.length-1, j = nums.length; i >  0; i--, j--) {
			nums[j - 1] = nums[i];
		}
		nums[j] = temp;
		System.out.println("Afetr Right Rotate: "+Arrays.toString(nums));
	}
}
