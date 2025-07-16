package com.interviews.leetcode.easy;

import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {

		int[][] matrix = { { 2, 4, -1 }, { -10, 5, 11 }, { 18, -2, 6 } };

		System.out.println("Input: " + Arrays.toString(matrix[0]));
		System.out.println("Input: " + Arrays.toString(matrix[1]));
		System.out.println("Input: " + Arrays.toString(matrix[2]));
		System.out.println("===========");
		int[][] result = getTransposeMatrix(matrix);

		System.out.println("Transpose Matrix Result: " + Arrays.toString(result[0]));
		System.out.println("Transpose Matrix Result: " + Arrays.toString(result[1]));
		System.out.println("Transpose Matrix Result: " + Arrays.toString(result[2]));

	}

	private static int[][] getTransposeMatrix(int[][] matrix) {

		int row = matrix.length;
		int column = matrix[0].length;
		int[][] transpose = new int[column][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}

		return transpose;
	}
}
