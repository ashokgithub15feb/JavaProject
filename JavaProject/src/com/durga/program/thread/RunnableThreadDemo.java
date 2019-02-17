package com.durga.program.thread;

public class RunnableThreadDemo {

	public static void main(String[] args) {
		
		MyRunnable myRunnable = new MyRunnable();
		
		Thread t = new Thread(myRunnable);
		
		t.start();
		
		for(int i=0; i< 10 ; i++)
		{
			System.out.println("Main Thread: "+i);
		}
		
		System.out.println(t.getName());
	}
}
