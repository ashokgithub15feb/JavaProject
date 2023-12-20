package com.datastructures.company.blackrock;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static void main(String[] args) {
		
		Object object = new Object();
		AtomicInteger atomicInteger = new AtomicInteger();
		
		Odd odd = new Odd(object, atomicInteger);
		Even even = new Even(object, atomicInteger);
		
		Thread t1 = new Thread(odd);
		Thread t2 = new Thread(even);
		
		t1.start();
		t2.start();
	}
}
