package com.durga.program.oops;

public class CountnumOfObject {

	static int count = 0;
	
	{
		count++;
	}
	
	CountnumOfObject()
	{
		
	}
	
	CountnumOfObject(int i)
	{
		this(10.4);
	}
	
	protected CountnumOfObject(double d)
	{
		super();
	}
	int i = 10;
	public static void m()
	{
		//this(12); // CTE
		//super(); // CTE
		
		//this.i = 100;
		//super.
		
	}
	
	public void m2()
	{
		//this(); // CTE
		//super(); // CTE
	}
	
	public static void main(String[] args) {
		
		CountnumOfObject o1 = new CountnumOfObject();
		
		CountnumOfObject o2 = new CountnumOfObject(10);
		
		CountnumOfObject o3 = new CountnumOfObject(10.5);
		
		System.out.println("Count Of Object: "+count);
		
		System.out.println("Exit Main Method");
	}
}
