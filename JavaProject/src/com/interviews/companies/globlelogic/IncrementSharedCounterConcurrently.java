package com.interviews.companies.globlelogic;

/*
 * 1. Increment a Shared Counter Concurrently
When multiple threads update a shared counter, the result can be inconsistent without synchronization.

 */
class Counter {
	private volatile int count;
	
	private final Object lock = new Object();
	
	public void increment() {
		synchronized (lock) {
			System.out.println(Thread.currentThread().getName() + " counter : "+ count );
			count++;
		}
	}
	
	public int getCount() {
		return count;
	}
}

public class IncrementSharedCounterConcurrently {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		Runnable task = () -> {
			for(int i=0; i<1000; i++) {
				counter.increment();
			}
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("IncrementSharedCounterConcurrently: Counter: "+counter.getCount());
	}
}
