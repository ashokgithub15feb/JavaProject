package com.leetcode.patterns.practice;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		int[][] matrix = {{1, 2, 3}, 
						  {4, 5 , 6}, 
						  {7, 8, 9},
						  {10, 11, 12}};
		
		List<Integer> result = printSpiralMatrix(matrix);
		System.out.println(result);
	}

	private static List<Integer> printSpiralMatrix(int[][] matrix) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		int l = 0;
		int r = matrix[0].length - 1;
		int t = 0;
		int b = matrix.length - 1;
		int d = 0;
		//[1, 2, 3, 6, 9, 8, 7, 4]
		while(l <= r && t <= b)
		{
			if(d == 0)
			{
				for(int i = l; i <= r; i++)
				{
					list.add(matrix[t][i]);
				}
				
				t++;
				d = 1;
			}
			
			if(d == 1)
			{
				for(int i = t; i <= b; i++)
				{
					list.add(matrix[i][r]);
				}
				r--;
				d = 2;
			}
			
			if(d == 2)
			{
				for(int i = r; i >= l; i--)
				{
					list.add(matrix[b][i]);
				}
				b--;
				d = 3;
			}
			
			if(d == 3)
			{
				for(int i = b; i >= t; i--)
				{
					list.add(matrix[i][l]);
				}
				l++;
				d = 0;
			}
		}
		
		return list;
	}
}
