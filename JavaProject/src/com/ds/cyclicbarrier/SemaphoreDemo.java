package com.ds.cyclicbarrier;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SemaphoreDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(50);
		
		int permits = 3;
		Semaphore semaphore = new Semaphore(permits );
		
		IntStream.of(1000).forEach(i -> executorService.execute(new Task(semaphore)));
		
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);
	}
}

class Task implements Runnable
{
	private Semaphore semaphore;
	
	public Task(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	@Override
	public void run() {
	
		//some operation
		//calling slow service
		
		try {
			semaphore.acquire(); // 3 thread at a time
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Slow servie"); //50 times concurrently
		
		semaphore.release();
		//rst of service
		
		
	}
}