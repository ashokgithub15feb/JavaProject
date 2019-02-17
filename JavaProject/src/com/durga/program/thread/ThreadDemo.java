package com.durga.program.thread;

public class ThreadDemo
{
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		//Thread tt =new Thread(t);
		
		//t.run(); //main thread call normal method only thread won't be created
		t.start();
		//tt.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread: "+i);
		}
	}
}
