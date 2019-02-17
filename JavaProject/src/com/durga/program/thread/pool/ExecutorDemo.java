package com.durga.program.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		
		 PrintJob[] jobs = {
				 				new PrintJob("Durga"),
				 				new PrintJob("Ravi"),
				 				new PrintJob("Shiva"),
				 				new PrintJob("Suresh"),
				 				new PrintJob("Anil"),
				 				new PrintJob("Pavan"),
		 				   };
		 
		 ExecutorService service = Executors.newFixedThreadPool(2);
		 
		 for(PrintJob job : jobs)
		 {
			 service.submit(job);
		 }
		 
		 service.shutdown();
	}
}

class PrintJob extends Thread// implements Runnable
{
	private String name;
	
	public PrintJob(String name) {
		
		this.name = name;
	}
	
	@Override
	public void run() {

		System.out.println(name+"----Job Started by Thread----"+Thread.currentThread().getName());
		
		try
		{
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name+"----Job Completed by Thread----"+Thread.currentThread().getName());
	}
}