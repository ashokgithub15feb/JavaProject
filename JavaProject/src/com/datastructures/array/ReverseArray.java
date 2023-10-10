package com.datastructures.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] nums = {8, 3, 9, 15, 6, 10, 7, 2, 12, 4};
		
		System.out.println(Arrays.toString(nums));
		
		int[] reversedArray = reverseArray(nums);
		System.out.println(Arrays.toString(reversedArray));
		
		int[] reversedArrayUsingSwaping = reverseUsingSwapping(nums);
		System.out.println(Arrays.toString(reversedArrayUsingSwaping));
	}

	private static int[] reverseArray(int[] nums) {
		
		int[] newNums = new int[nums.length];
		
		
		for(int i=nums.length-1, j = 0; i >= 0 ; i--, j++) {
			
			newNums[j] = nums[i];
		}
		
//		int j = 0;
//		for(int i=nums.length-1; i >= 0 ; i--) {
//			
//			newNums[j] = nums[i];
//			j++;
//		}
		return newNums;
	}
	
	private static int[] reverseUsingSwapping(int[] nums) {
		
		for(int i=0, j = nums.length -1 ; i < j ; i++, j--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
		
		return nums;
	}
}
