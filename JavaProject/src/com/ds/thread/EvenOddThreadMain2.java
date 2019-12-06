package com.ds.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddThreadMain2 {

	public static void main(String[] args) throws InterruptedException {
		
		Integer n = new Integer(10);
		
			Runnable odd = () -> {
				
				for (int i = 1; i <=10; i+=2) {
					try {
						synchronized (n) {
							if (i % 2 != 0) {
								System.out.println(i);
								
								//Thread.sleep(1000);
								
								n.notify();
							}
						}
						n.wait();
						
					} catch (Exception e1) {

					}
				}
				
			};
		
			Runnable even = () -> {
				
				for(int i=2; i<=10; i+=2)
				{
					synchronized (n) {
						try {
							if (i % 2 == 0) {

								System.out.println(i);
								//Thread.sleep(1000);
								n.notify();
							}
							n.wait();
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}

					}
				}
			};


			ExecutorService e1 = Executors.newFixedThreadPool(2);
			e1.execute(odd);
			e1.execute(even);
			
			e1.shutdown();
			
	}
}
