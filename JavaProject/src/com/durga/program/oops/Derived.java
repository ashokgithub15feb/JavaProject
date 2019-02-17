package com.durga.program.oops;

public class Derived extends Based {

	static int x=100;
	
	static 
	{
		m2();
	}

	public static void main(String[] args) {
		m2();
		System.out.println("main method() derived class");
	}
	private static void m2() {
		System.out.println(y);
	}
	
	static
	{
		System.out.println("second derivend static block");
	}
	
	static int y = 200;
}
