package com.durga.program.oops;

public class Child extends Parent {

	int x=100;
	
	{
		m2();
		System.out.println("child first instance block");
	}
	
	Child()
	{
		System.out.println("Child Constractor");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("Child Mian");
	}
	
	public void m2()
	{
		System.out.println(y);
	}
	
	{
		System.out.println("second child instance block");
	}
	int y = 200;
}
