package com.datastructures.recursion;

public class Quiz3 {

	public static void main(String[] args) {
		int x = 5;
		int c = 5;
		int result = f(x, c);
		System.out.println(result);
	}

	private static int f(int x, int c) {
		
		c = c - 1;
		
		if(c == 0)
			return 1;
		
		x = x + 1;
		return f(x, c) * x;
	}
}
