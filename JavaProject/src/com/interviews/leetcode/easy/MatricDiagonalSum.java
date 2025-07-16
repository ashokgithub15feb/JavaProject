package com.interviews.leetcode.easy;

public class MatricDiagonalSum {

	public static void main(String[] args) {
		
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		int result = matricDiagonalSum(matrix);
		
		System.out.println("Result: "+result);
	}

	private static int matricDiagonalSum(int[][] matrix) {
		
		int len = matrix.length;
		int sum  = 0;
		
		for(int i=0; i<len ; i++) {
			sum += matrix[i][i];
			sum += matrix[len-1-i][i];
		}
		
		if(len % 2 != 0) {
			sum -= matrix[len/2][len/2];
		}
		
		return sum;
	}
}
