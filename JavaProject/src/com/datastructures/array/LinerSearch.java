package com.datastructures.array;

public class LinerSearch {

	public static void main(String[] args) {
		
		int[] nums = { 8, 3, 7, 12, 6, 9, 10, 11, 15, 17 };
		
		int key = 10;
		
		int result = search(nums, key);
		if(result != -1)
			System.out.println("Data at index: "+result+" and value is: "+nums[result]);
		else 
			System.out.println("Data not found: "+result);
	}

	private static int search(int[] nums, int key) {
		
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] == key) {
				return i;
			}
		}
		return -1;
	}
}

