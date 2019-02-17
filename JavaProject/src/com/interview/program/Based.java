package com.interview.program;

public class Based {

	static int i =10;
	
	static
	{
		m1();
		System.out.println("Based static block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("main methid()");
	}
	private static void m1() {
		System.out.println(j);
	}
	
	static int j = 20;
}
