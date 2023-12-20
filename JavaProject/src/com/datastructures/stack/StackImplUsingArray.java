package com.datastructures.stack;

import java.util.Arrays;

public class StackImplUsingArray {

	private int size;
	private int top;
	private int[] stack;
	private int length;
	
	public StackImplUsingArray(int size) {
		this.size = size;
		this.top = -1;
		this.stack = new int[size];
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(top == size - 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack Overflow");
		}
		else {
			top++;
			stack[top] = data;
			length++;
		}
	}
	
	public int pop() {
		int x = -1;
		
		if(isEmpty()) {
			System.out.println("Stack underflow");
		}
		else {
			x = stack[top];
			stack[top] = 0;
			top--;
			length--;
		}
		
		return x;
	}
	
	public int stackTop() {
		if(top == -1) {
			return -1;
		}
		else {
			return stack[top];
		}
	}
	
	public int peek(int pos) {
		
		int x = -1;
		
		if(top - pos + 1 < 0) {
			System.out.println("Invalid Position");
		}
		else {
			x = stack[top - pos + 1];
		}
		
		return x;
	}
	
	public void display() {
		System.out.println(Arrays.toString(stack));
	}
	
	public static void main(String[] args) {
		
		int size = 5;
		StackImplUsingArray stackImpl = new StackImplUsingArray(size);
		
		System.out.println("Check Stack is Empty: "+stackImpl.isEmpty());
		stackImpl.display();
		stackImpl.push(10);
		stackImpl.push(20);
		stackImpl.push(30);
		stackImpl.push(40);
		stackImpl.push(50);
		stackImpl.display();
		//stackImpl.push(60);
		System.out.println("Check Stack is Full: "+stackImpl.isFull());
		stackImpl.display();
		int pos = 5;
		int peek = stackImpl.peek(pos);
		System.out.println("Peek Stack Element: "+peek);
		stackImpl.display();
		
		System.out.println("Top Stack Element: "+stackImpl.stackTop());
		stackImpl.display();
		System.out.println("Stack Length: "+stackImpl.length);
		System.out.println("Pop stack Elemet: "+stackImpl.pop());
		stackImpl.display();
		System.out.println("Stack Length: "+stackImpl.length);
		System.out.println("Pop stack Elemet: "+stackImpl.pop());
		System.out.println("Pop stack Elemet: "+stackImpl.pop());
		System.out.println("Pop stack Elemet: "+stackImpl.pop());
		System.out.println("Pop stack Elemet: "+stackImpl.pop());
		stackImpl.display();
		System.out.println("Stack Length: "+stackImpl.length);
		System.out.println("Pop stack Elemet: "+stackImpl.pop());
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the top
	 */
	public int getTop() {
		return top;
	}

	/**
	 * @param top the top to set
	 */
	public void setTop(int top) {
		this.top = top;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	
}
