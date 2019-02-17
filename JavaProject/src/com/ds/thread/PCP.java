package com.ds.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class PCP {

	static BlockingQueue<Integer> queue;

	public static void main(String[] args) {

		PCP.queue = new LinkedBlockingQueue<>();
		
		
		Runnable p = () -> {
			
			for(int i=0; i<10; i++)
			{
				try {
					System.out.println("Produce item in queue: "+i);
					queue.put(i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable c = () -> {
			
			while(true)
			{
				try
				{
					Integer take = queue.take();
					System.out.println("Consume item from queue: "+take);
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()/2);
		service.submit(p);
		service.submit(c);
		
	}
}
