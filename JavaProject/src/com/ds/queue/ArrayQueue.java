package com.ds.queue;

import java.util.NoSuchElementException;

public class ArrayQueue {

	private int[] queue;
	private int rear;
	private int front;
	private int size;
	private int len;
	private static final int DEFAULT_CAPACITY = 5;
	public ArrayQueue() {
		queue = new int[DEFAULT_CAPACITY];
		rear = -1;
		front = -1;
		size = 0;
		len = 0;
	}
	public boolean isEmpty() {
		return front == -1;
	}
	public boolean isFull() {
		return front == 0 && rear == size - 1;
	}
	public int getSize() {
		return len;
	}
	public int peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue Underflow Exception");
		}
		return queue[front]; // First-In-First-Out [FIFO]
	}
	public void insertion(int data) {
		if (rear == -1) {
			front = 0;
			rear = 0;
			queue[rear] = data;

		} else if (rear + 1 > size) {
			throw new IndexOutOfBoundsException("Queue Overflow Exception");

		} else if (rear + 1 < size) {
			queue[++rear] = data;
		}
		len++;
	}
	public int deletion() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue Undeflow Exception");
		} else {
			len--;
			int element = queue[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
			return element;
		}
	}
	public void display() {
		System.out.print("\nQueue = ");
		if (len == 0) {
			System.out.print("Empty\n");
			return;
		}
		for (int i = front; i < rear; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
}
