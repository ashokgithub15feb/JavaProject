package com.interviews.java8.programs;

public class ThreadA implements Runnable{

	@Override
	public void run() {

		System.out.println("ThreadA: "+Thread.currentThread().getName());
		
		m1();
	}
	
	public synchronized void m1() {
		for(int i=0; i< 5 ; i++) {
			System.out.println(i);
		}
	}
}
