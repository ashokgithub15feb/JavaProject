package com.durga.program.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService1 {

	public static void main(String[] args) {
	
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		
		ExecutorService service = Executors.newFixedThreadPool(availableProcessors);
		
		for(int i=1 ; i<100; i++)
		{
			service.execute(new Task());
		}
	}
}

class Task implements Runnable
{
	static int count = 1;
	public void run() {

		
		System.out.println("Count: "+(++count));
	}
}