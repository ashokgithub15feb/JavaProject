package com.interviews.java8.programs;

public class ThreadB implements Runnable{

	@Override
	public void run() {

		System.out.println("ThreadB: "+Thread.currentThread().getName());
		m2();
	}
	
	public synchronized void m2() {
		for(int i=5; i< 10 ; i++) {
			System.out.println(i);
		}
	}
}
