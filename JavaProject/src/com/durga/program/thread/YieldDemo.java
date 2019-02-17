package com.durga.program.thread;

class YieldThread extends Thread
{
	@Override
	public void run() {
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Child-Thread");
			Thread.yield(); //child thread always call yield() method because of the main thread will get chance more no.
			//of time and the chance of compiliting main thread firest high.
		}
	}
}

public class YieldDemo {

	public static void main(String[] args) {
		
		YieldThread t = new YieldThread();
		t.start();
		
		for(int i=0; i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
