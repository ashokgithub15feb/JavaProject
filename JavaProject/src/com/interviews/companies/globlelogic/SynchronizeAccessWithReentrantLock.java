package com.interviews.companies.globlelogic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//An alternative to synchronized blocks, providing more flexibility.
//ReentrantLock allows manual lock control and supports fairness.


class SafeCounter {
	
	private int count;
	private Lock lock = new ReentrantLock();
	
	
	public void increment() {
		try {
			lock.lock();
			
			count++;
		} finally {
			lock.unlock();
		}
	}
	
	public int getCount() {
		return count;
	}
}
public class SynchronizeAccessWithReentrantLock {

	public static void main(String[] args) throws InterruptedException {
		SafeCounter counter = new SafeCounter();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count: " + counter.getCount());
	}
}
