package com.durga.program.oops;

public class TestStatic1 {

	static
	{
		m1();
		System.out.println("FSTB");
	}

	private static void m1() { // indirect-read
		System.out.println(x);
	}
	
	private static int x;
}
