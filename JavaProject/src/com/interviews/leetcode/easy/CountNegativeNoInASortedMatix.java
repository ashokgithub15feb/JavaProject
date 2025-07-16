package com.interviews.leetcode.easy;

import java.util.Arrays;

public class CountNegativeNoInASortedMatix {

	public static void main(String[] args) {

		int[][] matrix = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2, }, { -1, -1, -2, -3 } };

		System.out.println(Arrays.toString(matrix[0]));
		System.out.println(Arrays.toString(matrix[1]));
		System.out.println(Arrays.toString(matrix[2]));
		System.out.println(Arrays.toString(matrix[3]));

		int result = countNegativeNoInASortedMatix(matrix);
		System.out.println("Result: "+result);
		
	}

	private static int countNegativeNoInASortedMatix(int[][] matrix) {

		int totalRow = matrix.length;
		int totalColumn = matrix[0].length;

		int row = 0;
		int column = totalColumn - 1;
		int count = 0;

		while (row < totalRow && column >= 0) {

			if (matrix[row][column] < 0) {
				column--;
				count += totalRow - row;
			} else {
				row++;
			}
		}

		return count;
	}
}
