package com.ds.caching;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		final AtomicInteger i = new AtomicInteger(0);
		
		final Object lock = new Object();
		
		final int MAX = 100;
		
		Runnable even = () ->
		{
			while(i.get() < MAX)
			{
				synchronized (lock) {
					
					if(i.get() % 2 == 0)
					{
						System.out.println(i.getAndAdd(1));
						
						lock.notify();
						
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}
				}
				synchronized (lock) {
					
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			
		};
		
		Runnable odd = () ->
		{
			while(i.get() <= MAX)
			{
				synchronized (lock) {
					
					if(i.get() % 2 != 0)
					{
						System.out.println(i.getAndAdd(1));
						
						lock.notify();
						
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
	
					}
				}
				synchronized (lock) {
					
					try
					{
						lock.wait();
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(even);
		executorService.execute(odd);
		
		executorService.shutdown();
		
	}
}
