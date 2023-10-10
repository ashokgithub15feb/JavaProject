package com.datastructures.array;

import java.util.Arrays;

public class ArrayElementOperation {

	public static void main(String[] args) {
		
		int[] nums = {8, 3, 9, 15, 6, 10, 7, 2, 12, 4};
		int index = 5;
		int getIndexdata = get(nums, index);
		System.out.println("Get: "+getIndexdata);
		
		int data = 20;
		int[] setIndexdata = set(nums, index, data);
		System.out.println("After Set: "+Arrays.toString(setIndexdata));
		
		
		int max = max(nums);
		System.out.println("Max: "+max);
		
		int min = min(nums);
		System.out.println("Min: "+min);
		
		
		int totalSum = sum(nums);
		System.out.println("Sum: "+totalSum);
		
		int totalSum1 = sum(nums, nums.length-1);
		System.out.println("Sum Using Recursion: "+totalSum1);
		
		int avg = avg(nums);
		System.out.println("Avg: "+avg);
	}

	private static int get(int[] nums, int index) {
		
		if(index >= 0 && index <= nums.length) {
			return nums[index];
		}
		
		return -1;
	}
	
	private static int[] set(int[] nums, int index, int data) {
		
		if(index >= 0 && index <= nums.length) {
			nums[index] = data;
			return nums;
		}
		
		return null;
	}
	
	private static int max(int[] nums) {
		
		int max = nums[0];
		for(int i=1; i< nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}
	
	private static int min(int[] nums) {
		
		int min = nums[0];
		for(int i=1; i< nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}
	
	public static int sum(int[] nums) {
		int total = 0;
		for(int i=0; i<nums.length; i++) {
			total = total + nums[i];
		}
		
		return total;
	}
	
	public static int sum(int[] nums, int n) {
		
		if(n < 0) {
			return 0;
		}
		else {
			return sum(nums, n - 1) + nums[n];
		}
	}
	
	public static int avg(int[] nums) {
		int total = 0;
		for(int i=0; i<nums.length; i++) {
			total = total + nums[i];
		}
		
		return total/2;
	}
}
