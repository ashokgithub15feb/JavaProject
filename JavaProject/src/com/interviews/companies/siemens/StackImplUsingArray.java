package com.interviews.companies.siemens;

public class StackImplUsingArray {

	//size - to create the array
	//arr - define arr of size
	//top - top of the stack in -1
	//len - calclate the total element in stack
	//stack operation - isempty, isfull, peek, push, pop, display, total stack data
	
	private int size;
	private int[] arr;
	private int top;
	private int len;
	
	public StackImplUsingArray(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
		len = 0;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top + 1 == size;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
		}
		
		return arr[top];
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack overflow");
			return;
		}
		
		if(top + 1 < size) {
			arr[++top] = data;
		}
		
		len++;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
		}
		
		int popData = arr[top];
		top--;
		len--;
		return popData;
	}
	
	public int stackLength() {
		return len;
	}
	
	public void display() {
		
		if(len == 0) {
			System.out.println("Stack is Empty");
			return;
		}
		
		for(int i = top; i>= 0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		StackImplUsingArray stack = new StackImplUsingArray(10);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.display();
		
		int result = stack.pop();
		System.out.println("Pop:"+result );
		stack.display();
		
		int peekData = stack.peek();
		System.out.println("Peek:"+peekData);
		System.out.println("Stack Length:"+stack.stackLength());
		System.out.println("Stack is full:"+stack.isFull());
		System.out.println("Stack is isEmpty:"+stack.isEmpty());
		
		stack.pop();
		stack.pop();
		stack.display();
		
		System.out.println("Stack is full:"+stack.isFull());
		System.out.println("Stack is isEmpty:"+stack.isEmpty());
		System.out.println("Stack Length:"+stack.stackLength());
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		stack.push(110);
		
		System.out.println("Stack is full:"+stack.isFull());
		System.out.println("Stack is isEmpty:"+stack.isEmpty());
		System.out.println("Stack Length:"+stack.stackLength());
		stack.display();
	}
	
}
