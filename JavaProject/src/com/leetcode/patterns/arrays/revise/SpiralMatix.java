package com.leetcode.patterns.arrays.revise;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatix {

	public static void main(String[] args) {
		
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		List<Integer> res = spiralMatrix(matrix);
		System.out.println(res);
	}

	private static List<Integer> spiralMatrix(int[][] matrix) {
	
		int row = matrix.length;
		int col = matrix[0].length;
		
		List<Integer> list = new ArrayList<Integer>();
		
		if(row == 0) return list;
		
		int l = 0;
		int r = col - 1;
		int t = 0;
		int b = row - 1;
		int d = 0;
		
		while(l <= r && t <= b)
		{
			if(d == 0)
			{
				for(int i=l; i<=r; i++)
				{
					list.add(matrix[t][i]);
				}
				d = 1;
				t++;
			}
			else if(d == 1)
			{
				for(int i=t; i<=b; i++)
				{
					list.add(matrix[i][r]);
				}
				d = 2;
				r--;
			}
			else if(d == 2)
			{
				for(int i=r; r>=l; i--)
				{
					list.add(matrix[b][i]);
				}
				d = 3;
				b--;
			}
			else if(d == 3)
			{
				for(int i=b; i>=t; i--)
				{
					list.add(matrix[i][l]);
				}
				d = 0;
				l++;
			}
		}
		
		return list;
	}
}
