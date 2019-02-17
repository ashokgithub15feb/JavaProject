package com.durga.program.thread;

class MyThreadJoin extends Thread
{
	public static Thread mt;
	
	@Override
	public void run() {
		
		try
		{
			//child thread calls join() method on main thread object, child thread has to wait until completing main thread.
			mt.join(1000);
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception occured while calling join() method");
		}
		
		for(int i=0; i<10;i++)
		{
			System.out.println("CHild Thread:");
		}
	}
	
}

public class JoinMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyThreadJoin.mt = Thread.currentThread();
		//Thread.currentThread().join(); // deadlock thread
		MyThreadJoin t = new MyThreadJoin();
		
		t.start();
		t.join(2000);
		MyThreadJoin.mt.interrupted();
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread:");
			Thread.sleep(2000);
		}
	}
}
