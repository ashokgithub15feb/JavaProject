package com.program.coding.round.sg2019;

public class QueueImpl {

	private int[] arr;
	private int rear;
	private int front;
	private int size;
	private int len;
	
	public QueueImpl(int n)
	{
		size = n;
		arr = new int[size];
		len = 0;
		front = -1;
		rear = -1;
	}
	
	public void enqueue(int item)
	{
		if(rear == -1)
		{
			rear = 0;
			front = 0;
			arr[rear] = item;
		}
		else if(rear + 1 > size)
		{
			System.out.println("Overflow");
		}else if(rear +1 < size)
		{
			arr[++rear] = item;
		}
		
		len++;
	}
	
	public int dequeue()
	{
		if(front == -1)
		{
			System.out.println("underflow");
			return 0;
		}
		else
		{
			len--;
			
			int item = arr[front];
			arr[front] = 0;
			
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			else
			{
				front++;
			}
			
			return item;
		}
		
	}
	
	public static void main(String[] args) {
		
		QueueImpl q = new QueueImpl(5);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(20);
		q.enqueue(10);
		q.enqueue(67);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}
