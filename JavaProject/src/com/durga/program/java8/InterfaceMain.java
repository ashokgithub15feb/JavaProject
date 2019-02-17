package com.durga.program.java8;

public interface InterfaceMain {

	public static void m1()
	{
		System.out.println("Interface static m1() method");
	}
	
	public static void m2()
	{
		System.out.println("Interface static m2() method");
	}
	
	public static void main(String[] args) {
		
		m1();
		m2();
		
		InterfaceMain.CI.main(args);
		
	}
	
	class CI
	{
		public static void main(String[] args) {
			
			InterfaceMain.m1();
		}
	}
}
