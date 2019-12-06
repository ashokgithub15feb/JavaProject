package com.ds.thread;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class QueueImpl {

		private int[] queue;
		private int size;
		private int front;
		private int rear;
		
		public QueueImpl(int size)
		{
			this.size = size;
			queue = new int[size];
			rear = -1;
			front = -1;
		}
		
		public boolean isEmpty()
		{
			return rear == -1;
		}
		
		public boolean isFull()
		{
			return rear == size;
		}
		
		public void enqueue(int item)
		{
			if(isFull())
			{
				System.out.println("\nQueue is full");
			}
			else if(rear < size)
			{
				if(rear == -1)
				{
					rear = 0;
					front = 0;
					queue[rear] = item;
					rear++;
				}
				else
				{
					queue[rear] = item;
					rear++;
				}
			}
		}
		
		public void dequeue()
		{
			if(isEmpty())
			{
				System.out.println("\nQueue is Empty");
			}
			else if(front < size)
			{
				if(front == 0)
				{
					int data = queue[front];
					queue[front] = 0;
					front++;
					
					System.out.print(data+" ");
				}else
				{
					int data = queue[front];
					queue[front] = 0;
					front++;
					System.out.print(data+" ");
				}
			}
		}
		
		public static void main(String[] args) {
			
			QueueImpl q = new QueueImpl(5);
//			q.enqueue(10);
//			q.enqueue(20);
//			q.enqueue(30);
//			q.enqueue(40);
//			q.enqueue(50);
//			
//			System.out.println(Arrays.toString(q.queue));
//			
//			q.dequeue();
//			q.dequeue();
//			q.dequeue();
//			q.dequeue();
//			q.dequeue();
			
			
			
			int[] data = {10, 20, 30, 40, 50};
			
			
			
			Runnable enqueue = () ->
			{
				for(int i=0; i<5; i++)
				{
					synchronized (q) {
					
						q.enqueue(data[i]);
						
						System.out.println(Arrays.toString(q.queue));
						
						try
						{
							Thread.sleep(1000);
						}catch(InterruptedException e)
						{
							e.printStackTrace();
						}
						
						if(q.isFull())
						{
							try
							{
								q.wait();
								
							}catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}
				
				synchronized (q) {
					
					q.notify();
				}
			};
			
			Runnable dequeue = () ->
			{
				for(int i=0; i<5; i++)
				{
					synchronized (q) {
					
						q.dequeue();
						
						try
						{
							Thread.sleep(1000);
						}catch(InterruptedException e)
						{
							e.printStackTrace();
						}
						
						if(q.isEmpty())
						{
							try
							{
								q.wait();
								
							}catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}
				
				synchronized (q) {
					
					q.notify();
				}
			};
			
			ExecutorService service = Executors.newFixedThreadPool(2);
			service.execute(enqueue);
			service.execute(dequeue);
			
			service.shutdown();
			
		}
	}
//	o/p:
//	====
//	[10, 0, 0, 0, 0]
//	[10, 20, 0, 0, 0]
//	[10, 20, 30, 0, 0]
//	[10, 20, 30, 40, 0]
//	[10, 20, 30, 40, 50]
//	10 20 30 40 50 
