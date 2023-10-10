package com.datastructures.recursion;

public class Quiz1 {

	static int i = 1;
	
	public static void main(String[] args) {
		
		int n = 1;
		
		int result = f(n);
		System.out.println(result);
	}

	private static int f(int n) {
		
		if(n >= 5) {
			return n;
		}
		
		n = n + 1;
		i++;
		
		return f(n);
	}
}
