package com.durga.program;

public class TestTypeCosting {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		
		Number n = (Number) i;
		
		Object o = (Object)n;
		
		if(i == n)
		{
			System.out.println("i==n");
		}
		
		if(n == o)
		{
			System.out.println("n==o");
		}
	}
}
