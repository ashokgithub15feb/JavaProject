package com.leetcode.patterns.arrays.revise;

public class Convert2DArray {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4};
		int row = 2;
		int column = 2;
		int[][] ans = convert2DArray(nums, row, column);
		
		for(int i=0; i<ans.length; i++)
		{
			for(int j=0; j<ans.length; j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] convert2DArray(int[] nums, int n, int m) {
		
		int n1 = nums.length;
		
		int[][] ans = new int[m][n];
		
		for(int i=0; i<n1; i++)
		{
			int r = i / n;
			int c = i % n;
			
			ans[r][c] = nums[i];
		}
		
		return ans;
	}
}
