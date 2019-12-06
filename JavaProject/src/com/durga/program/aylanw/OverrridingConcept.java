package com.durga.program.aylanw;

public class OverrridingConcept {


	public static void main(String[] args) {
		
		A a = new A();
		a.m1();
		
		A aa = new B();
		aa.m1();
	}
}

class A
{
	public void m1()
	{
		System.out.println("A-m1()");
	}
}

class B extends A
{
	public void m1()
	{
		System.out.println("B-m1()");
	}
}