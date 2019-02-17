package com.durga.program.java8.stream;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueueUsingCallable {

	private static BlockingQueue<Integer> queue;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ProducerConsumerBlockingQueueUsingCallable.queue = new LinkedBlockingQueue<>();

		Callable<Integer> prod = () -> {

			for (int i = 0; i <= 10; i++) {
				try {
					System.out.println("Produced: " + i);

					queue.put(i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return 0;
		};

		Callable<Integer> consu = () -> {

			while (true) {
				try {
					System.out.println("Consumed: " + queue.take());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		ExecutorService service = Executors.newFixedThreadPool(2);

		Future<Integer> submit = service.submit(prod);
		Future<Integer> submit2 = service.submit(consu);

		System.out.println("Produced Future Result: " + submit.get());
		System.out.println("Consumed Future Result: " + submit2.get());

		service.shutdown();
	}

}
