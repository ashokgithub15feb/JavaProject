package com.leetcode.patterns.arrays;

public class ClimbingStairs {

	public static void main(String[] args) {
		
		int n = 5;
		
		int result = climbingStairs(n);
		
		System.out.println("Total Climbing Stairs: "+result);
	}

	private static int climbingStairs(int n) {

		int[] memo = new int[n+1];
		
		return rec(n, memo);
	}

	private static int rec(int n, int[] memo) {

		if(n <= 1 || n == 0) return 1;
		
		if(memo[n] > 0) return memo[n];
		
		int op1 = rec(n-1, memo);
		int op2 = rec(n-2, memo);
		
		memo[n] = op1 + op2;
		
		return op1 + op2;
		
	}
}
