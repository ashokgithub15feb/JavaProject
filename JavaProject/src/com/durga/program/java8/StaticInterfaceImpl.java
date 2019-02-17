package com.durga.program.java8;

public class StaticInterfaceImpl// implements StaticInterface 
{

	public static void main(String[] args) {
		
		StaticInterface.m1();
		StaticInterface.m2();
		StaticInterface.m3();
		StaticInterface.m4();
		//m1();// The method m1() is undefined for the type StaticInterfaceImpl
		
	}
}

interface StaticInterface{
	
	public static void m1()
	{
		System.out.println("Interface static m1() method");
	}
	
	public static void m2()
	{
		System.out.println("Interface static m2() method");
	}
	
	public static void m3()
	{
		System.out.println("Interface static m3() method");
	}
	
	public static void m4()
	{
		System.out.println("Interface static m4() method");
	}
}