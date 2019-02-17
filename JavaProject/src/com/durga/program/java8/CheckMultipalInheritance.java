package com.durga.program.java8;

public class CheckMultipalInheritance{

	public static void main(String[] args) {
	
		CC1 c = new CC1();
		c.m1();
		
		CC2 c1 = new CC2();
		c1.m2();
		
		TestLeftAndRightImpl t = new TestLeftAndRightImpl();
		t.m1();
		
		
	}
}


interface II1
{
	public void m1();
	
	default void m2()
	{
		System.out.println("Default m2() method in II1 interface");
	}
	
	// default void m3(); can not 
}

interface II2
{
	public void m1();
}

class CC1 implements II1, II2
{
	@Override
	public void m1() {
		
		
		System.out.println("Override m1() method");
	}
}

class CC2 implements II1, II2
{
	@Override
	public void m1() {
		
		System.out.println("Override m1() method");
	}
	
	@Override
	public void m2() {
		
		System.out.println("Override default method from Iterface II1");
	}
}


interface Left
{
	default void m1()
	{
		System.out.println("Left m1() method");
	}
}

interface Right
{
	default void m1()
	{
		System.out.println("Right m1() method");
	}
}

class TestLeftAndRightImpl implements Left, Right
{
	@Override
	public void m1() {
		
		Left.super.m1();
		Right.super.m1();
		System.out.println("Our Own Override the m1() method");
		
	}
}