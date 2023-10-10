package com.datastructures.recursion;

public class CombinationFormula2 {
	//Pascals Triangle
	public static void main(String[] args) {
		
		int n = 5;
		int r = 3;
	
		int result = c(n , r);
		System.out.println(result);
	}

	private static int c(int n, int r) {
	
		if(r == 0 || n == r) {
			return 1;
		}
		else {
			return c(n - 1, r - 1) + c(n - 1, r);
		}
		
	}
}
