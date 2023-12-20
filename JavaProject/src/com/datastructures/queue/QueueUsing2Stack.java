package com.datastructures.queue;

import com.datastructures.stack.StackImplUsingArray;

public class QueueUsing2Stack {

	private StackImplUsingArray s1;
	private StackImplUsingArray s2;
	
	public QueueUsing2Stack(int size) {
		this.s1 = new StackImplUsingArray(size);
		this.s2 = new StackImplUsingArray(size);
	}

	public void enqueue(int x) {
		s1.push(x);
	}
	
	public int dequeue() {
		int x = -1;
		if(s2.isEmpty()) {
			if(s1.isEmpty()) {
				System.out.println("Queue is Underflow");
				return x;
			}
			else {
				while(!s1.isEmpty()) {
					s2.push(s1.pop());
					s1.pop();
				}
			}
		}
		x = s2.stackTop();
		s2.pop();
		return x;
	}
	
	
	public static void main(String[] args) {

	}
}
