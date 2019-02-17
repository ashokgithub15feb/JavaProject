package com.durga.program.map;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

	public static void main(String[] args) {
		
		int parties = 3;
		final CyclicBarrier cb = new CyclicBarrier(parties , new Runnable() {
			
			@Override
			public void run() {
				System.out.println("All parties arrived at barrier point, let's play");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t1 = new Thread(new Task(cb), "Thread-1");
		Thread t2 = new Thread(new Task(cb), "Thread-2");
		Thread t3 = new Thread(new Task(cb), "Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Main thread - completed");
	}
}

class Task implements Runnable
{
	
	private CyclicBarrier barrier;
	
	public Task(CyclicBarrier barrier) {
		this.barrier = barrier;
	}
	
	@Override
	public void run() {

		try
		{
			System.out.println(Thread.currentThread().getName()+" is waiting on bareier");
			
			barrier.await();
			System.out.println(Thread.currentThread().getName()+" is closed the bareier");
			
		}catch (InterruptedException | BrokenBarrierException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
