package com.durga.program.java8;

public class MyRunnable implements Runnable{

	@Override
	public void run() {

		for(int i=0; i<10; i++)
		{
			System.out.println("Child Thread: "+i);
		}
	}
}
