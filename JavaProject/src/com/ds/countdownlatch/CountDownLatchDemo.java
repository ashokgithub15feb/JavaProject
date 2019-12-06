package com.ds.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		int count = 3;
		CountDownLatch latch = new CountDownLatch(count);
		service.submit(new DependantService1(latch));
		service.submit(new DependantService2(latch));
		service.submit(new DependantService3(latch));
		
		try {
		
			latch.await();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("All Dependent service initilized");
	}
}


class DependantService1 implements Runnable
{
	private CountDownLatch latch;
	private static int i=0;
	public DependantService1(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() 
	{
		latch.countDown();
		i++;
		System.out.println(i);
	}
}

class DependantService2 implements Runnable
{
	private CountDownLatch latch;
	private static int i=0;
	public DependantService2(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() 
	{
		latch.countDown();
		i++;
		System.out.println(i);
	}
}

class DependantService3 implements Runnable
{
	private CountDownLatch latch;
	private static int i=0;
	public DependantService3(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() 
	{
		latch.countDown();
		i++;
		System.out.println(i);
	}
}
