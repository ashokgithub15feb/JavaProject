package com.durga.program.thread;

public class P3Thread implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Chile-Thread-P3Thread: "+i);
		}
	}
}
