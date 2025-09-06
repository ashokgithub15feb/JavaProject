package com.interviews.java8.programs;

public class Main {

	public static void main(String[] args) {
		
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		t1.start();
		t2.start();
		
	}
}
