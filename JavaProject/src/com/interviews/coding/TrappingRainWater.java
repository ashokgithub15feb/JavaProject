package com.interviews.coding;

import java.util.Arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		
		int[] height = {4, 2, 0, 3, 2, 5};
		
		int result = trappingRainWater(height);
		
		System.out.println(result);
	}

	private static int trappingRainWater(int[] height) {
		
		int len = height.length;
		
		int[] left = new int[len];
		int[] right = new int[len];
		
		left[0] = height[0];
		for(int i=1; i< len ; i++) {
			left[i] = Math.max(height[i], left[i-1]);
		}
		System.out.println(Arrays.toString(left));
		right[len - 1] = height[len - 1];
		
		for(int i= len - 2; i >= 0 ; i--) {
			right[i] = Math.max(height[i], right[i + 1]);
		}
		System.out.println(Arrays.toString(right));
		
		int water = 0;
		
		for(int i = 0; i< len ; i++) {
			water += Math.min(left[i], right[i]) - height[i];
		}
		
		return water;
	
	}
}
