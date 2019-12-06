package com.ds.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class EvenOddNumber {

	private static int start = 0;
	private static int max = 10;
	
	public static void main(String[] args) {
		
		EvenOddNumber oEvenOddNumber = new EvenOddNumber();
		
		oEvenOddNumber.printEvenOdd();
	}

	private void printEvenOdd() {
		Runnable even = () -> 
		{
			Lock lock = new ReentrantLock();
			while(start < max)
			{
				lock.lock();
				
				if(start % 2 == 0)
				{
					System.out.println(Thread.currentThread().getName()+": "+start);
					start++;
					this.notify();
				}
				else
				{
					try
					{
						this.wait();
					}catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		};
		
		Runnable odd = () -> 
		{
			Lock lock = new ReentrantLock();
			while(start < max)
			{
				lock.lock();
				
				if(start % 2 == 1)
				{
					System.out.println(Thread.currentThread().getName()+": "+start);
					start++;
					this.notify();
				}
				else
				{
					try
					{
						this.wait();
					}catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		};
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(even);
		service.execute(odd);
		
		service.shutdown();
	}
}
