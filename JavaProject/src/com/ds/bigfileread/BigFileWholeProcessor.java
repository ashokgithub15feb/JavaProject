package com.ds.bigfileread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class BigFileWholeProcessor {

	public static void main(String[] args) {
		
		String fileName = "E:\\DK_Data\\Interview Data\\Company_Interview_Question.txt";
//		BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
	
		final BlockingQueue<String> queue = new LinkedBlockingQueue<>();

		final Object lock = new Object();
		
		Runnable bigFileReader = () -> {
			
			try(Scanner scan = new Scanner(new File(fileName)))
			{
				System.out.println("File reading line by line in BlockingQueue");
				
				while(scan.hasNext())
				{
					if(queue.size() < 100)
					{
						queue.put(scan.nextLine());
						
						synchronized(lock)
						{
							lock.notify();
						}
					}
					else
					{
						try
						{
							synchronized (lock) {
								
								lock.wait();
							}
							
						}catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}

				
			} catch (FileNotFoundException | InterruptedException e) {
				System.out.println("bigFileReader: "+Thread.currentThread().getName()+""+e.getMessage());
			}
			
		};
		
		Runnable bigFileProcessor = () -> {
			
			try
			{
				String lines = "";
				
				while((lines = queue.take()) != null)
				{
					//need to process the lines
					if(!queue.isEmpty())
					{
						System.out.println("Big file processor: "+lines);
						synchronized (lock) {
							lock.notify();
						}
					}
					else
					{
						try
						{
							synchronized (lock) {
								lock.wait();
							}
						}catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
				
				
			}catch (Exception e) {
				System.out.println("bigFileProcessor: "+Thread.currentThread().getName()+""+e.getMessage());
			}
		};
		
//		try {
			
			/*
			 * Exception in thread "main" java.lang.NullPointerException
	at java.util.concurrent.LinkedBlockingQueue.put(Unknown Source)
	at com.ds.bigfileread.BigFileWholeProcessor.main(BigFileWholeProcessor.java:98)

			 */
			
//			queue.put(null);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(bigFileReader);
		service.execute(bigFileProcessor);
		
		service.shutdown();
		queue.clear();
	}
}
