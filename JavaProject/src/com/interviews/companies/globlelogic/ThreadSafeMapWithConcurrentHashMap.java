package com.interviews.companies.globlelogic;

import java.util.concurrent.ConcurrentHashMap;

//Enables concurrent access without locking the entire map.
//Allows safe concurrent updates without synchronization overhead.



public class ThreadSafeMapWithConcurrentHashMap {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        Runnable writerTask = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put(Thread.currentThread().getName() + i, i);
                
                System.out.println(map);
            }
        };

        Thread t1 = new Thread(writerTask);
        Thread t2 = new Thread(writerTask);
        t1.start();
        t2.start();
	}
}
