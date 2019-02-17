package com.durga.program.java8;

public class TestLambdaExp {

	//public void run()
	//public void m1() 
	// method argument must be same except modifier and return type
	private int m1() //private int m1(int j) - The type TestLambdaExp does not define m1() that is applicable here - because run() not caontaining any argument 
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Child Thread: "+i);
		}
		return 0;
	}
	public static void main(String[] args) {
		
		TestLambdaExp tt = new TestLambdaExp();
		
		Runnable r = tt::m1; 
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread: "+i);
		}
	}
}
