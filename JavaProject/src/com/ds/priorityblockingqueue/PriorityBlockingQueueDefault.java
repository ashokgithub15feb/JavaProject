package com.ds.priorityblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDefault {

	public static void main(String[] args) {
		
		String[] cityName = {"Bangalore", "Pune", "Mumbai", "Channai", "Hyderabad", "Gujrat", "Ballia", "Lucknow", "Kanpur", "Kalkata"};
		
		BlockingQueue<String> queue = new PriorityBlockingQueue<>();
		
		Runnable produce = () ->
		{
			for(int i=0; i<cityName.length; i++)
			{
				try{
					queue.put(cityName[i]);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable consumer = () -> 
		{
			for(int i=0; i<cityName.length; i++)
			{
				try {
				
					System.out.println("Consumed: "+queue.take());

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(produce);
		executorService.execute(consumer);
		
		executorService.shutdown();
	}
}
