package com.interviews.companies.globlelogic;

import java.util.concurrent.Semaphore;

//Semaphores control the number of threads accessing a resource.
//Only 3 threads can access the critical section at once.
//in between semaphore.acquire(); and semaphore.release(); resources


public class ControlSynchronizationWithSemaphore {

	private static int permit = 3;
	private static Semaphore semaphore = new Semaphore(permit );
		
	
	public static void main(String[] args) {
		Runnable task = () -> {
			
			try {
				
				semaphore.acquire();
				
				System.out.println(Thread.currentThread().getName() + " acquired a permit.");
				
				Thread.sleep(1000);
				
				System.out.println(Thread.currentThread().getName() + " releasing permit.");
				semaphore.release();
				
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		};
		
		for (int i = 0; i < 5; i++) {
            new Thread(task, "Thread-" + i).start();
        }
	}
}
