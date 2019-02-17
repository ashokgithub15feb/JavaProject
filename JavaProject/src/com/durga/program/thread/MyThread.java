package com.durga.program.thread;

public class MyThread extends Thread
{
	@Override
	public void run() {

		for(int i=0; i<10; i++)
		{
			System.out.println("Chile Thread: "+i);
		}
	}
	
	/*@Override //main thread will be class this method
	public synchronized void start() {
		
		System.out.println("Overriding start() method");
	}*/
	
	public synchronized void start() {
		super.start();
		System.out.println("Overriding start() method");
	}
}


