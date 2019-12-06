package com.ds.priorityblockingqueue;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.stream.Collectors;

public class PriorityBlockingQueueCustom {

	public static void main(String[] args) {
		
		String[] cityName = {"Bangalore", "Pune", "Mumbai", "Channai", "Hyderabad", "Gujrat", "Ballia", "Lucknow", "Kanpur", "Kalkata"};
		
		BlockingQueue<String> queue = new PriorityBlockingQueue<>(10, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
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
		
		/*
		 * Consumed: Pune
Consumed: Mumbai
Consumed: Lucknow
Consumed: Kanpur
Consumed: Kalkata
Consumed: Hyderabad
Consumed: Gujrat
Consumed: Channai
Consumed: Bangalore
Consumed: Ballia


		 */
		
		
		
		
	}
}
