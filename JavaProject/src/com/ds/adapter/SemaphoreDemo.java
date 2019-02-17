package com.ds.adapter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SemaphoreDemo {

	public static void main(String[] args) throws InterruptedException
	{
		ExecutorService service = Executors.newFixedThreadPool(50);
		IntStream.of(1000).forEach(i -> service.submit(new Task()));
		
		service.shutdown();
		service.awaitTermination(1, TimeUnit.MINUTES);
	}
}


class Task implements Runnable
{
	private int i = 0;
	
	@Override
	public void run() {

//		try
//		{
			i++;
			System.out.println("i values is : "+i);
//			Thread.sleep(1000);
//		}catch(InterruptedException e)
//		{
//			e.printStackTrace();
//		}
	}
}