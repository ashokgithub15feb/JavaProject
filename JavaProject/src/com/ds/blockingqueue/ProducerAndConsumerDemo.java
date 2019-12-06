package com.ds.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerAndConsumerDemo {

	public static void main(String[] args) {
		
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		
		Runnable producer = () ->
		{
			for(int i=0; i<100;i++)
			{
				Message msg = new Message(i+"");
				
				try {
				
					Thread.sleep(i);
					queue.put(msg);
					System.out.println("Produced: "+msg.getMsg());
					
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			
			Message msg = new Message("exit");
			try
			{
				queue.put(msg);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		};

		Runnable consumer = () ->
		{
			try
			{
				Message msg = null;
				
				while((msg = queue.take()).getMsg() != "exit")
				{
					Thread.sleep(10);
					System.out.println("Consumed: "+msg.getMsg());
				}
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(producer);
		service.execute(consumer);
		
		System.out.println("Producer and Consumer has been started");

		service.shutdown();
	}
}
