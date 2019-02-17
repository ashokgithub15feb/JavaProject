package com.durga.program.thread;

public class BDeadlock {

	public synchronized void d2(ADeadlock a)
	{
		System.out.println("Thread-2 start executing of d2() method");
		
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread-2 trying to call ADeadlock last() method");
		
		a.last();
		
	}
	
	public synchronized void last()
	{
		System.out.println("Inside BDeadlock last() method");
	}
}
