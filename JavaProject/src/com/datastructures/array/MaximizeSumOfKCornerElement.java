package com.datastructures.array;

public class MaximizeSumOfKCornerElement {

	public static void main(String[] args) {
		
		int[] nums = {8, 4, 4, 8, 12, 3, 2, 3};
		int k = 3;
		
		maximizeSumOfKCornerElement(nums, k);
	}

	private static void maximizeSumOfKCornerElement(int[] nums, int k) {
		int n = nums.length;
		int sum = 0;
		
		
		for(int i = 0; i < k; i++) {
			sum = sum + nums[i];
		}
		
		int l = k - 1;
		int r = n - 1;
		int temp = sum;
		
		while(l >= 0 && r >= 0) {
			temp = temp + nums[r--];
			temp = temp - nums[l--];
			sum = Math.max(sum, temp);
		}
		System.out.println(sum);
		
	}
}
