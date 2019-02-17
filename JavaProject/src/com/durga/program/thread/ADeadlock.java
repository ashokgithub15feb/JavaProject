package com.durga.program.thread;

public class ADeadlock {

	public synchronized void d1(BDeadlock b)
	{
		System.out.println("Thread-1 start executing of d1() method");
		
		try
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread-1 trying to call BDeadlock last() method");
		
		b.last();
		
	}
	
	public synchronized void last()
	{
		System.out.println("Inside ADeadlock last() method");
	}
}
