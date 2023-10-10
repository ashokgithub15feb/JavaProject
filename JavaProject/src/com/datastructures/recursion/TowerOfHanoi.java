package com.datastructures.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		
		int n = 6;
		int A = 1;
		int B = 2; 
		int C = 3;
		
		toh(n, A, B, C);
	}

	private static void toh(int n, int A, int B, int C) {
		if(n > 0) {
			
			toh(n - 1, A, C, B);
			
			System.out.print("("+A+", "+C+")"+" ");
			
			toh(n - 1, B, A, C); 
		}
	}
}
