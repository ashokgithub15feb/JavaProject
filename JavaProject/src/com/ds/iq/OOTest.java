package com.ds.iq;

import java.io.Serializable;

public class OOTest implements Serializable{

	public static void main(String[] args) {
		
		Super s = new Sub();
		int i = s.i;
		System.out.println(i);
		s.m1();
	}
	
	
}

class Super
{
	int i = 10;
	
	public void m1()
	{
		System.out.println("Super-m1()");
	}
}

class Sub extends Super
{
	int i = 20;
	
	public void m1()
	{
		System.out.println("Sub-m1()");
	}
}