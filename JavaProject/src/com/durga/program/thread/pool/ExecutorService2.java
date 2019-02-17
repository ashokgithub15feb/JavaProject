package com.durga.program.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService2 {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		for(int i=1; i<100; i++)
		{
			service.execute(new Task2());
		}
		
		System.out.println("Thread Name: "+Thread.currentThread().getName());
	}
}

class Task2 implements Runnable
{
	@Override
	public void run() {

		System.out.println("Thread name : "+Thread.currentThread().getName());
	}
}