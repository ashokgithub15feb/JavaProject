package com.leetcode.patterns.arrays;

import java.util.Arrays;

public class Convert1DArrayTo2DArray {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4};
		int row = 2;
		int column = 2;
		
		int[][] result = construct2DArray(nums, row, column);
		
		System.out.println(Arrays.toString(result[0]));
		System.out.println(Arrays.toString(result[1]));
		
	}

	private static int[][] construct2DArray(int[] nums, int row, int column) {

		if(nums == null || nums.length == 0) return new int[0][0];
		
		int length = nums.length;
		
		if(length != row * column) return new int[row][column];
		
		int[][] res = new int[row][column];
		
		for(int i=0; i<length; i++)
		{
			int newRow = i / row;    // 0, 0, 1, 1
			int newColumn = i % row; // 0, 1, 0, 1
			
			res[newRow][newColumn] = nums[i];
		}
		
		return res;
	}
}
