package com.durga.program;

import java.io.IOException;

class PP
{
	PP() throws IOException
	{
		
	}
}

// CTE - Default constructor cannot handle exception type IOException thrown by implicit super constructor. Must define an explicit constructor
class CC extends PP
{
	// child class constructor can throws the as a same exception of parent class otherwise can be throws as a same exception or parent of the exception
	
	//if parent class throw any checked exception, cuplustonry chile class constructor should throw same checked exception or its parent. otherview 
	
	CC() throws IOException, Exception, Throwable
	{
		super();
	}
}
public class CycleCalling
{
	
	//recursive method is runtime exception - StackOverflowError
	////recursive constructor at compile time error
	CycleCalling()
	{
		this(10);
	}
	
	CycleCalling(int i)
	{
	//	this(); // recursive constructor invocation  
	}
	public static void m1()
	{
		m2();
	}
	
	public static void m2()
	{
		m1();
	}
	
	public static void main(String[] args) {
		
		CycleCalling o = new CycleCalling();
		o.m1(); //Exception in thread "main" java.lang.StackOverflowError

		System.out.println("main");
	}
}
