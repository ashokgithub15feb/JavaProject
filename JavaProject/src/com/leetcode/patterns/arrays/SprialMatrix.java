package com.leetcode.patterns.arrays;

import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {

	public static void main(String[] args) {
		
		int[][] matrix = {{1, 2, 3, 4}, 
				          {5, 6, 7, 8}, 
				          {9, 10, 11, 12}
				          };
		
		List<Integer> result = sprialMatrixOrder(matrix);
		System.out.println(result);
	}

	private static List<Integer> sprialMatrixOrder(int[][] matrix) {
		
		List<Integer> list = new ArrayList<Integer>();
		int row = matrix.length;
		int col = matrix[0].length;

		if(row == 0)
			return list; 
		
		int l = 0, r = col - 1, t = 0, b = row - 1, d = 0;
		
		while(l <= r && t <= b)
		{
			if(d  == 0) // ----> right direction
			{
				for(int i=l; i<=r; i++) //left column to right column
				{
					list.add(matrix[t][i]);
				}
				t++; //top increase	
				d = 1;
			}else if(d == 1) // down direction
			{
				for(int i=t; i<=b; i++) // top to bottom
				{
					list.add(matrix[i][r]);
				}
				r--; //right decrease
				d = 2;
			}else if(d == 2) // left direction
			{
				for(int i=r; i>=l; i--) // right column to left column
				{
					list.add(matrix[b][i]);
				}
				b--; // bottom decrease 
				d = 3;
			}else if(d == 3) // top direction
			{
				for(int i=b; i>=t; i--) // bottom to top
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
