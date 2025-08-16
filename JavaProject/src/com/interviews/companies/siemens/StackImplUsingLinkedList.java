package com.interviews.companies.siemens;

public class StackImplUsingLinkedList {

	private int size;
	private Node top;
	
	public StackImplUsingLinkedList() {
		size = 0;
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(int value) {
		Node nptr = new Node(value, null);
		size++;
		if(top == null) {
			top = nptr;
		} else {
			nptr.next = top;
			top = nptr;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("No Such Element - Stack Underflow");
			return -1;
		}
		
		Node ptr = top;
		top = ptr.next;
		size--;
		int popData = ptr.data;
		
		return popData;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("No Such Element - Stack Underflow");
			return -1;
		}
		
		int peekData = top.data;
		
		return peekData;
	}
	
	public void display() {
		if(size == 0) {
			System.out.println("Stack Empty");
			return;
		}
		
		Node current = top;
		
		while(current != null) {
			System.out.print(current.data+"->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	
	public static void main(String[] args) {
		
		StackImplUsingLinkedList stack = new StackImplUsingLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.display();
		
		System.out.println("Stack Pop data: "+stack.pop());
		
		stack.display();
		
		System.out.println("Stack Peek data: "+stack.peek());
	}
}
