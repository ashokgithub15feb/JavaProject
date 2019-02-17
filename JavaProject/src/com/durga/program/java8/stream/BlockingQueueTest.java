package com.durga.program.java8.stream;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueueTest {

	private List<Object> queue = new LinkedList<>();
	  private int  limit = 10;

	  public BlockingQueueTest(int limit){
	    this.limit = limit;
	  }
	  
	  public synchronized void enqueue(Object item) throws InterruptedException
	  {
		  while(this.queue.size() == this.limit)
		  {
			  wait();
		  }
		  
		  if(this.queue.size() == 0)
		  {
			  notify();
		  }
		  
		  this.queue.add(item);
	  }
	  
	  public synchronized Object dequeue() throws InterruptedException
	  {
		  while(this.queue.size() == 0)
		  {
			  wait();
		  }
		  
		  if(this.queue.size() == this.limit)
		  {
			  notify();
		  }
		  
		  return this.queue.remove(0);
	  }
	  
	public static void main(String[] args) {
		
		BlockingQueueTest queue = new BlockingQueueTest(10);
		
		Runnable r1 = () -> {
			
			for(int i=0; i<10; i++)
			{
				try {
					System.out.println("Enqueue Item: "+i);
					queue.enqueue(i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable r2 = () -> {
			
			while(true)
			{
				try
				{
					System.out.println("Dequeue Item: "+queue.dequeue());
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.getStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(r1, "Enqueue-Thread");
		Thread t2 = new Thread(r2, "Dequeue-Thread");
		
		t1.start();
		t2.start();
	}
}
