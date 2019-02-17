package com.durga.program.oops;

public class Parent {

	int i = 10;
	
	{
		m1();
		System.out.println("parent instance block");
	}
	
	Parent()
	{
		System.out.println("Parent Constractor");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println("Parent main");
	}
	
	public void m1()
	{
		System.out.println(j);
	}
	
	int j = 20;
	
}
