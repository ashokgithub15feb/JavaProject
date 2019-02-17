package com.durga.program.java8.stream;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ProducerAndConsumer {


	public static void main(String[] args) throws InterruptedException
	{
		ExecutorService service = Executors.newFixedThreadPool(2);
		AtomicInteger sharedState = new AtomicInteger();
		CountDownLatch countDownLatch = new CountDownLatch(1);
		
		Runnable producer = () -> {
			
			Integer produceElement = ThreadLocalRandom.current().nextInt();
			System.out.println("Producer Element: "+produceElement);
			sharedState.set(produceElement);
			countDownLatch.countDown();
			
		};
		
		Runnable consumer = () -> {
			
			try {
				countDownLatch.await();
				Integer consumedElement = sharedState.get();
				System.out.println("Consumed Element: "+consumedElement);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		};
		
		service.execute(producer);
		service.execute(consumer);
		
		service.awaitTermination(500, TimeUnit.MICROSECONDS);
		service.shutdown();
		
		
	}
}
