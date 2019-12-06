package com.durga.program.thread.interthread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		Runnable producer = () ->
		{
			synchronized (list) {
			
				for(int i=0; i<10; i++)
				{
					if(list.size() >= 1)
					{
						try
						{
							System.out.println("Producer is waiting:");
							list.wait();
						}catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
					System.out.println("Produce item: "+i);
					list.add(i);
					list.notify();
				}
			}
		};
		
		Runnable consumer = () ->
		{
			synchronized (list) {
			
				for(int i=0; i<10; i++)
				{
					while(list.isEmpty())
					{
						System.out.println("Consumer is waiting:");
						try
						{
							list.wait();
						}catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
					int k = list.remove(0);
					System.out.println("Consumer item: "+k);
					list.notify();
				}
			}
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(producer);
		executorService.execute(consumer);
		
		
		executorService.shutdown();
	}
}
