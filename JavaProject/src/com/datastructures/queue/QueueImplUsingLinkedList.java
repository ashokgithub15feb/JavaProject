package com.datastructures.queue;

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
}
public class QueueImplUsingLinkedList {

	int size;
	Node front;
	Node rear;
	
	public QueueImplUsingLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public void enqueue(int x) {
		Node nptr = new Node(x);
		
		if(rear == null) {
			front = nptr;
			rear = nptr;
		}
		else {
			rear.next = nptr;
			rear = rear.next;
		}
		size++;
	}
	
	public int dequeue() {
		int x = -1;
		
		if(front == null) {
			System.out.println("Queue is empty");
		}
		else {
			Node ptr = front;
			front = ptr.next;
			if(front == null) {
				rear = null;
			}
			x = ptr.data;
			ptr = null;
			size--;
		}
		return x;
	}
	
	public void display() {
		if(size == 0) {
			System.out.println("Empty");
			return;
		}
		
		Node ptr = front;
		while(ptr != rear.next) {
			System.out.print(ptr.data+"->");
			ptr = ptr.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		QueueImplUsingLinkedList qull = new QueueImplUsingLinkedList();
		qull.enqueue(10);
		qull.enqueue(20);
		qull.enqueue(30);
		qull.enqueue(40);
		qull.enqueue(50);
		qull.display();
		qull.dequeue();
		qull.dequeue();
		qull.dequeue();
		qull.dequeue();
		qull.dequeue();
		qull.dequeue();
		qull.display();
	}
}
