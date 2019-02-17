package com.durga.program;


//Identification of static member from top to bottom [1 to 6]
//Execution of static variable assignment and static block from top to bottom [7 to 12]
//execution of main method(); [13 to 15]

/*
 * steps:
 * -----
 * i = 0; [RIWO] - Read indirectly Write Only
 * i = 0; [RIWO]
 * i = 10 [R & W]
 * j = 20 [R & W]
 *
 */
public class Base {

	//(1)
	static int i=10; //(7)
	
	//(2)
	static
	{
		m1(); //(8)
		System.out.println("First static bloc"); //(10)
	}
	
	//(3)
	public static void main(String[] args) {
		m1(); //(13)
		System.out.println("Main method"); // (15)
	}
	
	//(4)
	public static void m1()
	{
		System.out.println(j); //(9) -------- o/p = 0, (14) --------- o/p = 20
	}
	
	//(5)
	static {
		System.out.println("second static block"); //(11)
	}
	
	//(6)
	static int j = 20; // (12)
}
