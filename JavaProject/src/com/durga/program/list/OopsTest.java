package com.durga.program.list;

import com.durga.program.list.PolyForm.CC;

public class OopsTest {

	public static void main(String[] args) {
		
		C1 c1 = new C1();
		c1.m1();
		c1.m2("Hello- c1");
		
		C2 c2 = new C2();
		c2.m1();
		c2.m2("Hello- c2");
		
		C3 c3 = new C3();
		c3.m1();
		c3.m2("Hello- c3");
		System.out.println("========================");
		I1 i1 = new C1();
		i1.m1();
		i1.m2("Hello-I1");
		
		I1 i2 = new C2();
		i2.m1();
		i2.m2("Hello-I2");
		
		I1 i3 = new C3();
		i3.m1();
		i3.m2("Hello-I3");
		
		
		System.out.println("=========================");
		
		PolyForm oPolyForm = new PolyForm();
		oPolyForm.common(i1);
		oPolyForm.common(i2);
		oPolyForm.common(i3);
		System.out.println("==========================");
		PolyForm.CC m = oPolyForm.new CC();
		m.m1();
	}
}

interface I1
{
	public void m1();
	public void m2(String s);
}

class C1 implements I1
{
	public void m1()
	{
		System.out.println("C1-m1()");
	}
	public void m2(String s)
	{
		System.out.println("C1-m2()");
	}
}

class C2 implements I1
{
	public void m1()
	{
		System.out.println("C2-m1()");
	}
	public void m2(String s)
	{
		System.out.println("C2-m2()");
	}
}

class C3 implements I1
{
	public void m1()
	{
		System.out.println("C3-m1()");
	}
	public void m2(String s)
	{
		System.out.println("C3-m2()");
	}
}

class PolyForm
{
	public void common(I1 i)
	{
		i.m1();
		i.m2("Hello Class - m2() method");
	}
	
	protected class CC extends C1
	{
		@Override
		public void m1() {
			super.m1();
		}
	}
}


