package com.ds.iq;

public class JPDemo
{
	public static void main(String[] args) {
		
		int n = 4;
		
		System.out.println(countway(n));
		
		n = 9;
		
		System.out.println(fib(n));
	}

	private static int countway(int n) {
		
		return fib(n+1);
	}

	private static int fib(int i) {
		
		if(i <= 1)
		{
			return i;
		}
		
		return fib(i-1) + fib(i-2);
	}
	
	
}
