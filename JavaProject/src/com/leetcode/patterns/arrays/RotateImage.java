package com.leetcode.patterns.arrays;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {
		
		int[][] matrix = {{1, 2, 3}, 
				          {4, 5, 6}, 
				          {7, 8, 9}};
	
		System.out.println("Original Matrix:");
		System.out.println(Arrays.toString(matrix[0]));
		System.out.println(Arrays.toString(matrix[1]));
		System.out.println(Arrays.toString(matrix[2]));
		
		
		rotateImage(matrix);
		
		System.out.println("Result:");
		System.out.println(Arrays.toString(matrix[0]));
		System.out.println(Arrays.toString(matrix[1]));
		System.out.println(Arrays.toString(matrix[2]));
		
	}

	private static void rotateImage(int[][] matrix) {
		
		int n = matrix.length;
		
		//transpose the matrix
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		//reverse the matrix
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n/2; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n-1-j];
				matrix[i][n-1-j] = temp;
			}
		}
	}
}
