package com.interviews.companies.globlelogic;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//Allows multiple readers or one writer at a time.
//Allows efficient concurrent reads while writing is exclusive.


class SharedData  {
	private int value;
	private ReadWriteLock rwLock = new ReentrantReadWriteLock();

	 public void write(int newValue) {
	        rwLock.writeLock().lock();
	        try {
	            value = newValue;
	        } finally {
	            rwLock.writeLock().unlock();
	        }
	    }

	    public int read() {
	        rwLock.readLock().lock();
	        try {
	            return value;
	        } finally {
	            rwLock.readLock().unlock();
	        }
	    }
}
public class ConcurrentAccessWithReadWriteLock {

	public static void main(String[] args) {
		
		SharedData data = new SharedData();
		
		
		Runnable read = () -> {
			System.out.println(Thread.currentThread().getName() + " working...");
			
			data.read();
		};
		
		Runnable write = () -> {
			System.out.println(Thread.currentThread().getName() + " working...");
			
			data.write(1);
		};
		
		for (int i = 0; i < 3; i++) {
            new Thread(read, "read-" + i).start();
        }
		
		for (int i = 0; i < 1; i++) {
            new Thread(write, "write-" + i).start();
        }
		
	}
}
