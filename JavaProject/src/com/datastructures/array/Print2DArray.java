package com.datastructures.array;

public class Print2DArray {

	public static void main(String[] args) {
		
		int[][] nums = {{1,2,3}, {4,5,6}, {7,8,9}};
		for(int i = 0; i< nums.length; i++) {
			for(int j=0; j<nums.length; i++) {
				System.out.println(nums[i][j]+" ");
			}
		}
	}
}
