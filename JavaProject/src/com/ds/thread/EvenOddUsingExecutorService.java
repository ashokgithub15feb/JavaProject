package com.ds.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


//https://stackoverflow.com/questions/11411890/java-how-to-print-odd-and-even-numbers-from-2-separate-threads-using-executor-f

public class EvenOddUsingExecutorService {

	public static void main(String[] args) {
		
		final int max = 100;
		
		final AtomicInteger i = new AtomicInteger(0);
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		final Object lock = new Object();
		
		Runnable even = () ->
		{
			while(i.get() < max)
			{
				if(i.get() % 2 == 0)
				{
					System.out.println(" "+i.getAndAdd(1));
					
					synchronized (lock) { //java.lang.IllegalMonitorStateException
					
						lock.notify();
					}
				}
				else
				{
					synchronized(lock)
					{
						try
						{
							lock.wait();
						}catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		
		Runnable odd = () -> 
		{
			while(i.get() < max)
			{
				if(i.get() % 2 != 0)
				{
					System.out.println(" "+i.getAndAdd(1));
					
					synchronized(lock)
					{
						lock.notify();
					}
				}
				else
				{
					synchronized (lock) {
						
						try
						{
							lock.wait();
						}catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}
				}
			}
		};
		
		service.execute(even);
		service.execute(odd);
		
		service.shutdown();
	}
}
