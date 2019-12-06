package com.ds.caching;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueImpl {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		BlockingQueue<Message> queue = new LinkedBlockingQueue<>();
		Producer oProducer = new Producer(queue );
		Consumer oConsumer = new Consumer(queue);

		executorService.execute(oProducer);
		executorService.execute(oConsumer);
		
		
		executorService.shutdown();
	}
}

class Message
{
	private String msg;
	
	public Message(String msg)
	{
		this.msg = msg;
	}
	
	public String getMsg()
	{
		return msg;
	}
}

class Producer implements Runnable
{
	private BlockingQueue<Message> queue;
	
	public Producer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<100; i++)
		{
			Message msg = new Message(" "+i);
			
			try {
			
				queue.put(msg);
				System.out.println("Produced Message: "+msg.getMsg());
				Thread.sleep(i);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Message msg = new Message("exit");
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Consumer implements Runnable
{
	private BlockingQueue<Message> queue;
	
	public Consumer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		
		Message msg = null;

		try
		{
			while((msg = queue.take()).getMsg() != "exit")
			{
				try {
				
					queue.take();
					System.out.println("Consumed Message: "+msg.getMsg());
					Thread.sleep(10);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}