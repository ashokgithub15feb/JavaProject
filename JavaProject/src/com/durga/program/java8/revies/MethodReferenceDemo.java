package com.durga.program.java8.revies;

import java.util.concurrent.locks.ReentrantLock;

public class MethodReferenceDemo {

	ReentrantLock l = new ReentrantLock();
	
	public int m1()
	{
		l.lock();
		for(int i=0; i<10; i++)
		{
			System.out.println("Child Thread");
		}
		l.unlock();
		return 70;
	}
	
	public static void main(String[] args) {
		
		MethodReferenceDemo m = new MethodReferenceDemo();
		
		Runnable r = m::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread-1"+Thread.currentThread().getName());
		}
		
		Runnable r1 = m::m1;
		Thread t1 = new Thread(r);
		t1.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread-2"+Thread.currentThread().getName());
		}
	}
}
