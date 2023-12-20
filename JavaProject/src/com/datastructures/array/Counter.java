package com.datastructures.array;

public class Counter {

	private int counter = 0;
	
	public void increment() {
		counter++;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		Runnable r1 = () -> counter.increment();
		Runnable r2 = () -> counter.increment();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		Thread.sleep(1000);
		t2.start();
		Thread.sleep(1000);
		
		System.out.println(counter.getCounter());
	}
}
