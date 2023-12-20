package com.datastructures.company.blackrock;

import java.util.concurrent.atomic.AtomicInteger;

public class Even implements Runnable{

	private Object obj;
	private AtomicInteger atomicInteger;
	
	public Even(Object obj, AtomicInteger atomicInteger) {
		this.obj = obj;
		this.atomicInteger = atomicInteger;
	}

	@Override
	public void run() {
		synchronized (obj) {
			while(true) {
				try {
					if(atomicInteger.get() % 2 != 0) {
						obj.wait();
					}
					else {
						System.out.println("Even: "+atomicInteger);
						Thread.sleep(500);
						atomicInteger.incrementAndGet();
						obj.notify();
					}
					
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
