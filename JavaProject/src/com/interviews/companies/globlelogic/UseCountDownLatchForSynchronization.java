package com.interviews.companies.globlelogic;

import java.util.concurrent.CountDownLatch;

//Allows threads to wait until a set of operations completes.
//Main thread waits till latch counts down to zero.



public class UseCountDownLatchForSynchronization {

	private static int count = 3;
	private static CountDownLatch countDownLatch = new CountDownLatch(count );
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable worker = () -> {
			System.out.println(Thread.currentThread().getName() + " working...");
			
			countDownLatch.countDown();
			
		};
		
		for (int i = 0; i < 3; i++) {
            new Thread(worker, "Worker-" + i).start();
        }
		
		countDownLatch.await();
		
		System.out.println("All workers done. Main thread proceeding.");
	}
}
