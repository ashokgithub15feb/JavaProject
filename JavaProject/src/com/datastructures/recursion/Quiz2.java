package com.datastructures.recursion;

public class Quiz2 {

	public static void main(String[] args) {
		
		int n = 2048;
		int sum = 0;
		
		foo(n, sum);
	}

	private static void foo(int n, int sum) {
		
		int k = 0;
		int j = 0;
		if(n == 0)
			return;
		
		k = n % 10;
		j = n /10;
		sum = sum + k;
		foo(j, sum);
		System.out.print(k+" ");
	}
}
