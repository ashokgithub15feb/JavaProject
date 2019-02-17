package com.durga.program.java8;

import java.util.Comparator;

@FunctionalInterface
public interface InterfaceFun {

	public void m1(); //if m1() is not there then immediately we will get CTE,  Invalid '@FunctionalInterface' annotation; InterfaceFun is not a functional interface
	
	// because of m4() , functional interface should contain single abstract method on;y
	//public void m4(); //Invalid '@FunctionalInterface' annotation; InterfaceFun is not a functional interface
	
	default void m2()
	{
		
	}
	
	public static void m3()
	{
		
	}
}


@FunctionalInterface
interface CC extends Comparator
{
	public int compare(Object o1, Object o2);
	//public boolean equal(String s);
	
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


//@FunctionalInterface
interface C extends B
{
	
}