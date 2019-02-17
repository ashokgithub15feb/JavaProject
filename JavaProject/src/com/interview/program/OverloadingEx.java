package com.interview.program;

public class OverloadingEx 
{
	public void m1(int i)
	{
		System.out.println("int-args");
	}
	
	public void m1(float f)
	{
		System.out.println("float-args");
	}
	
	public static void main(String[] args) {
		
		OverloadingEx o = new OverloadingEx();
		o.m1(10);
		o.m1(10.5F);
		o.m1('a');
		o.m1(10L);
	}
}
