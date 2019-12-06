package com.ds.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		int parties = 3;

		CyclicBarrier barrier = new CyclicBarrier(parties);
		
		service.submit(new Task1(barrier));
		service.submit(new Task2(barrier));
		service.submit(new Task3(barrier));
		
		try {
		
			Thread.sleep(6000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("All the task completed and reached barrier point");
	}
}


class Task1 implements Runnable
{
	private CyclicBarrier barrier;
	public Task1(CyclicBarrier barrier) {
		this.barrier = barrier;
	}
	
	@Override
	public void run() 
	{
		while(true)
		{
			try
			{
				barrier.await();
				System.out.println("task-1");
				Thread.sleep(3000);
				
			}
			catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		}
	}
}

class Task2 implements Runnable
{
	private CyclicBarrier barrier;
	public Task2(CyclicBarrier barrier) {
		this.barrier = barrier;
	}
	
	@Override
	public void run() 
	{
		while(true)
		{
			try
			{
				barrier.await();
				System.out.println("task-2");
				Thread.sleep(4000);
			}
			catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		}
	}
}

class Task3 implements Runnable
{
	private CyclicBarrier barrier;
	public Task3(CyclicBarrier barrier) {
		this.barrier = barrier;
	}
	
	@Override
	public void run() 
	{
		while(true)
		{
			try
			{
				barrier.await();
				System.out.println("task-3");
				Thread.sleep(5000);
			}
			catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		}
		
	}
}
