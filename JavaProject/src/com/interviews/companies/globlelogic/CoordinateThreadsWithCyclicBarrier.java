package com.interviews.companies.globlelogic;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

//Allows a set of threads to wait for each other at a barrier point.
//Threads wait at barrier and proceed together.



public class CoordinateThreadsWithCyclicBarrier {

	private static int parties = 3;
	
	 private static CyclicBarrier barrier = new CyclicBarrier(parties, () -> {
	        System.out.println("All threads reached barrier. Let’s proceed");
	    });
	
	public static void main(String[] args) {
		
		Runnable task = () -> {
			
			try {
				
				System.out.println(Thread.currentThread().getName() + " waiting.");
				
				barrier.await();
				
				System.out.println(Thread.currentThread().getName() + " resumed.");
				
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
		};
		
		for (int i = 0; i < 3; i++) {
            new Thread(task, "Thread-" + i).start();
        }
	}
}
