package com.datastructures.queue;

import java.util.Arrays;

public class CircularQueueImplUsingArray {

	private int size;
	private int front;
	private int rear;
	private int[] circularQueue;
	
	public CircularQueueImplUsingArray(int size) {
		this.size = size;
		this.front = 0;
		this.rear = 0;
		this.circularQueue = new int[size];
	}
	
	public void enqueue(int x) {
		if((rear + 1) % size == front) {
			System.out.println("Circular queue is full");
		}
		else {
			rear = (rear + 1) % size;
			circularQueue[rear] = x;
		}
	}
	
	public int dequeue() {
		int x = -1;
		
		if(front == rear) {
			System.out.println("Circular Queue is Empty");
		}
		else {
			front = (front + 1) % size;
			x = circularQueue[front];
			circularQueue[front] = 0;
		}
		
		return x;
	}
	
	public void display() {
		System.out.println(Arrays.toString(circularQueue));
	}
	
	public static void main(String[] args) {
		
		int size = 7;
		
		CircularQueueImplUsingArray queueImplUsingArray = new CircularQueueImplUsingArray(size);
		System.out.println("Front = "+queueImplUsingArray.front+", Rear = "+queueImplUsingArray.rear);
		queueImplUsingArray.display();
		queueImplUsingArray.enqueue(10);
		queueImplUsingArray.enqueue(20);
		queueImplUsingArray.enqueue(30);
		queueImplUsingArray.enqueue(40);
		queueImplUsingArray.enqueue(50);
		queueImplUsingArray.display();
		System.out.println("Front = "+queueImplUsingArray.front+", Rear = "+queueImplUsingArray.rear);
		queueImplUsingArray.enqueue(50);
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
		queueImplUsingArray.enqueue(90);
		queueImplUsingArray.enqueue(100);
		queueImplUsingArray.display();
		System.out.println("Front = "+queueImplUsingArray.front+", Rear = "+queueImplUsingArray.rear);
		
	}
}
