package com.durga.program.thread;

public class MyThreadDeadlock extends Thread{

	private ADeadlock a = new ADeadlock();
	private BDeadlock b = new BDeadlock();
	private static	MyThreadDeadlock t = new MyThreadDeadlock();
	
	
	public void m1()
	{
		this.start();
//		t.setDaemon(true); //Exception in thread "main" java.lang.IllegalThreadStateException 
						  // change the nature of daemon thread before the start the thread. other we will get runtime exception saying ITSE
		a.d1(b);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Before- Main Thread: "+t.isDaemon());
		t.setDaemon(true);
		System.out.println("After- Main Thread: "+t.isDaemon());
		t.m1();
	}
	@Override
	public void run() {
		
		System.out.println("Child Thread: "+t.isDaemon());
		b.d2(a);
	}
}
