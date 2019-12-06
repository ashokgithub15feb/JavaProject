package com.program.coding.round.sg2019;

import java.util.Arrays;

public class ArrayImplOfQueue {

	private int front;
	private int rear;
	private int capacity;
	private int[] queue;
	
	public ArrayImplOfQueue(int n)
	{
		capacity = n;
		front = 0;
		rear = 0;
		queue = new int[capacity];
	}
	
	public void enqueue(int data)
	{
		if(rear == capacity)
		{
			System.out.println("Overflow");
			return;
		}
		else
		{
			queue[rear] = data;
			rear++;
		}
	}
	
	public void dequeue()
	{
		if(front == rear)
		{
			System.out.println("underflow");
		}
		else
		{
			for(int i=0; i<rear-1; i++)
			{
				queue[i] = queue[i+1];
			}
			
			if(rear < capacity)
			{
				queue[rear] = 0;
			}
			
			rear--;
		}
	}
	
	
	public void printQueue()
	{
		System.out.println(Arrays.toString(queue));
	}
	
	public static void main(String[] args) {
		
		ArrayImplOfQueue queue = new ArrayImplOfQueue(8);
		
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(5);
		queue.enqueue(20);
		queue.enqueue(19);
		queue.enqueue(50);
		
		queue.printQueue();
		
		System.out.println();
		
		queue.dequeue();
		
		queue.printQueue();
		
		System.out.println();

		queue.dequeue();

		queue.printQueue();
		
		System.out.println();
		
	}
}
