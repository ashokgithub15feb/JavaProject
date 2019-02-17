package com.durga.program.java8.stream;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueue {

	private static BlockingQueue<Integer> queue;
	
	public static void main(String[] args) {

		ProducerConsumerBlockingQueue.queue = new LinkedBlockingQueue<>();
		
		Runnable prod = () -> {

			for(int i=0; i<=10; i++)
			{
				try {
					System.out.println("Produced: "+i);

					queue.put(i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable consu = () -> {
			
			while(true)
			{
				try
				{
					System.out.println("Consumed: "+queue.take());
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(prod, "Producer-Thread");
		Thread t2 = new Thread(consu, "Consumer-Thread");
		
//		t1.start();
//		t2.start();
//		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<1;i++)
		{
			service.submit(t1);
			service.submit(t2);
			
		}
		
	}
	
}
