package com.datastructures.queue;

import java.util.Arrays;

public class QueueImplUsingArray {

	private int size;
	private int front;
	private int rear;
	private int[] queue;
	
	public QueueImplUsingArray(int size) {
		this.size = size;
		this.front = -1;
		this.rear = -1;
		this.queue = new int[size];
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {
		return rear == size - 1 ;
	}
	
	public void enqueue(int x) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		else {
			rear++;
			queue[rear] = x;
		}
	} 
	
	public int dequeue() {
		int x = -1;
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			rear = -1;
			front = -1;
		}
		else {
			front++;
			x = queue[front];
			queue[front] = 0;
		}
		
		return x;
	}
	
	public void display() {
		System.out.println(Arrays.toString(queue));
	}
	public static void main(String[] args) {
		
		int size = 7;
		QueueImplUsingArray queueImplUsingArray = new QueueImplUsingArray(size);
		queueImplUsingArray.display();
		queueImplUsingArray.enqueue(10);
		queueImplUsingArray.enqueue(20);
		queueImplUsingArray.enqueue(30);
		queueImplUsingArray.enqueue(40);
		queueImplUsingArray.enqueue(40);
		System.out.println("Front = "+queueImplUsingArray.front+", Rear = "+queueImplUsingArray.rear);
		queueImplUsingArray.display();
		queueImplUsingArray.enqueue(50);
		queueImplUsingArray.enqueue(60);
		queueImplUsingArray.display();
		System.out.println("Front = "+queueImplUsingArray.front+", Rear = "+queueImplUsingArray.rear);
		queueImplUsingArray.dequeue();
		queueImplUsingArray.display();
		System.out.println("Front = "+queueImplUsingArray.front+", Rear = "+queueImplUsingArray.rear);
		queueImplUsingArray.dequeue();
		queueImplUsingArray.dequeue();
		queueImplUsingArray.dequeue();
		queueImplUsingArray.dequeue();
		queueImplUsingArray.display();
		System.out.println("Front = "+queueImplUsingArray.front+", Rear = "+queueImplUsingArray.rear);
		queueImplUsingArray.dequeue();
		queueImplUsingArray.dequeue();
		queueImplUsingArray.display();
		System.out.println("Front = "+queueImplUsingArray.front+", Rear = "+queueImplUsingArray.rear);
		queueImplUsingArray.dequeue();
		System.out.println("Front = "+queueImplUsingArray.front+", Rear = "+queueImplUsingArray.rear);
		queueImplUsingArray.display();
		queueImplUsingArray.enqueue(101);
		queueImplUsingArray.enqueue(201);
		queueImplUsingArray.enqueue(301);
		queueImplUsingArray.enqueue(401);
		queueImplUsingArray.display();
		System.out.println("Front = "+queueImplUsingArray.front+", Rear = "+queueImplUsingArray.rear);
		queueImplUsingArray.dequeue();
		queueImplUsingArray.dequeue();
		queueImplUsingArray.display();
		System.out.println("Front = "+queueImplUsingArray.front+", Rear = "+queueImplUsingArray.rear);
	}
}
