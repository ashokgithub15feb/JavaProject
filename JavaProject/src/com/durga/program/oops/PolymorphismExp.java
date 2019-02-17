package com.durga.program.oops;

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

class C extends B
{
	public void m1()
	{
		System.out.println("C-m1()");
	}
}

class Common
{
	public static void poly(A ref)
	{
		ref.m1();
	}
}
public class PolymorphismExp 
{
	public static void main(String[] args) {
		
		A a = new A();
		
		B b = new B();
		
		C c = new C();
		
		Common.poly(a);
		Common.poly(b);
		Common.poly(c);
		
		
//		A ref;
//		
//		ref = a;
//		ref.m1();
//		
//		ref = b;
//		ref.m1();
//		
//		ref = c;
//		ref.m1();
		
	}
}
