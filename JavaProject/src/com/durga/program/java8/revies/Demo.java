package com.durga.program.java8.revies;

public class Demo {

	public static void main(String[] args) {
		
		C c = new C();
		c.m1();
		
		A a = new C();
		a.m1();
		
		A aa = () -> System.out.println("m1() method - Lambda Expression");
		aa.m1();
		aa.m1();
		aa.m1();
		aa.m1();
		
		
	}
}

@FunctionalInterface
interface A
{
	public void m1();
}

@FunctionalInterface
interface B extends A
{
	public void m1();
}

class C implements B
{
	@Override
	public void m1() {

		System.out.println("m1() method");
	}
}