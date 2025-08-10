package com.interviews.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class SetMatrix9 {

	public static void main(String[] args) {
		//int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 0 } };
		print(matrix);
		int[][] result = setMatrix(matrix);
	}

	private static int[][] setMatrix(int[][] matrix) {
		
		int rows = matrix.length;
		int colus = matrix[0].length;
		Set<Integer> setrows = new HashSet<>();
		Set<Integer> setcolns = new HashSet<>();
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<colus; j++) {
				if(matrix[i][j] == 0) {
					setrows.add(i);
					setcolns.add(j);
				}
			}
		}
		System.out.println(setrows);
		System.out.println(setcolns);
		
		for(int i =0 ; i< rows; i++) {
			for(int j=0; j<colus; j++) {
				if(setrows.contains(i) || setcolns.contains(j)) {
					matrix[i][j] = 0;
				}
			}
		}
		print(matrix);
		return matrix;
	}
	
	public static void print(int[][] m) {
		for(int i =0 ; i< m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
