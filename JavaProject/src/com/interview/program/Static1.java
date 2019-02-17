package com.interview.program;

public class Static1
{
	static int x = m1();
	
	
	
	static
	{
		System.out.println("Static block loading at the time of classloading");
	}
	public static void main(String[] args) {
		System.out.println(x);
	}
	private static int m1() {
		return 10;
	}
	
	static Static1 s = new Static1();
	
	Static1()
	{
		System.out.println("Static1 contractor");
	}
	
}
