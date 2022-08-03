package com.leetcode.patterns.arrays;

import java.util.Arrays;

public class SetMatrixZero {
	
	public static void main(String[] args) {
		
		int[][] matrix = {{1,1,1},
						  {1,0,1},
						  {1,1,1}
						  };
		
		//int[][] matrix = {{1,0,3}};
		
		System.out.println("Original Array: ");
		
		System.out.println(Arrays.toString(matrix[0]));
		System.out.println(Arrays.toString(matrix[1]));
		System.out.println(Arrays.toString(matrix[2]));
		
		
		int n = matrix.length;
		int m = matrix[0].length;
		
		boolean row = false, column = false;
		
		for(int i=0; i<n; i++) 
			if(matrix[i][0] == 0) 
				column = true;
		
		for(int j=0; j<m; j++) 
			if(matrix[0][j] == 0) 
				row = true;
		
		
		for(int i=1; i<n; i++)
		{
			for(int j=1; j<m; j++)
			{
				if(matrix[i][j] == 0)
				{
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		
		for(int i=1; i<n; i++)
		{
			if(matrix[i][0] == 0)
			{
				for(int j=0; j<m; j++)
				{
					matrix[i][j] = 0;
				}
			}
		}
		
		for(int j=1; j<m; j++)
		{
			if(matrix[0][j] == 0)
			{
				for(int i=0; i<n; i++)
				{
					matrix[i][j] = 0;
				}
			}
		}
		
		if(row)
		{
			for(int j=0; j<m; j++)
			{
				matrix[0][j] = 0;
			}
		}
		
		if(column)
		{
			for(int i=0; i<n; i++)
			{
				matrix[i][0] = 0;
			}
		}
		
		System.out.println("Result Array: ");
		
		System.out.println(Arrays.toString(matrix[0]));
		System.out.println(Arrays.toString(matrix[1]));
		System.out.println(Arrays.toString(matrix[2]));
		
		
	}
}
