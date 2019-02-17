package com.durga.program.java8.stream;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class SynchronousQueueDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		SynchronousQueue<Integer> queue = new SynchronousQueue<>();
		
		Runnable producer = () -> {
		    Integer producedElement = ThreadLocalRandom
		      .current()
		      .nextInt();
		    System.out.println("Produced Element: "+producedElement);
		    try {
		        queue.put(producedElement);
		    } catch (InterruptedException ex) {
		        ex.printStackTrace();
		    }
		};
		
		Runnable consumer = () -> {
		    try {
		        Integer consumedElement = queue.take();
		        System.out.println("Consumed Element: "+consumedElement);
		    } catch (InterruptedException ex) {
		        ex.printStackTrace();
		    }
		};
		
		executor.execute(producer);
		executor.execute(consumer);
		 
		executor.awaitTermination(500, TimeUnit.MILLISECONDS);
		executor.shutdown();
	}
}
