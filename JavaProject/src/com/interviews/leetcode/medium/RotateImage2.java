package com.interviews.leetcode.medium;

/*
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
DO NOT allocate another 2D matrix and do the rotation.

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

 */
public class RotateImage2 {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		print(matrix);
		System.out.println();
		rotateImage(matrix);
		print(matrix);

	}

	private static void rotateImage(int[][] matrix) {

		transportMatrix(matrix);
		reverseRow(matrix);
	}

	private static void transportMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j <= i; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	private static void reverseRow(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int left = 0;
			int right = matrix.length - 1;

			while (left < right) {
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;
				left++;
				right--;
			}
		}
	}

	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
}

/*
 * 1 4 7 2 5 8 3 6 9
 * 
 * 7 4 1 8 5 2 9 6 3
 * 
 * =====
 * 
 * 
 */