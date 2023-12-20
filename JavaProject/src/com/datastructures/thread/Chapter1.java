package com.datastructures.thread;

public class Chapter1 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread currentThread = Thread.currentThread();
		
		System.out.println("Current Thread: "+currentThread);
		
		currentThread.setName("My Thread");
		
		System.out.println("Current Thread: "+currentThread);
		
		Thread.sleep(10_000);
	}
}
