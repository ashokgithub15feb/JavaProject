package com.ds.thread;

public class EvenOddThreadMain {

	public static void main(String[] args) throws InterruptedException {
		
		int n = 10;
		Object object=new Object();
		EvenThread e = new EvenThread(n,object);
		OddThread o = new OddThread(n,object);
		
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(o);
		
		t1.start();
		t2.start();
		
	}
}
