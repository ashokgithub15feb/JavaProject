package com.datastructures.stack;

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public Node() {
	}
	
	
}
public class StackImplUsingLinkedList {

	private Node top;
	private int size;
	
	public StackImplUsingLinkedList() {
		this.top = null;
		this.size = 0;
	}
	
	public void push(int data) {
		Node nptr = new Node(data);
		
		if(top == null) {
			top = nptr;
		}
		else {
			nptr.data = data;
			nptr.next = top;
			top = nptr;
		}
		size++;
	}
	
	public int pop() {
		int x = -1;
		if(top == null) {
			System.out.println("Stack Underflow");
		}
		else {
			Node ptr = top;
			top = top.next;
			x = ptr.data;
			size--;
		}
		return x;
	}
	
	public int peek(int pos) {
		Node ptr = top;
		
		for(int i = 0; i < pos - 1 && ptr != null ; i++) {
			ptr = ptr.next;
		}
		
		if(ptr != null) {
			return ptr.data;
		}
		else {
			return -1;
		}
	}
	
	public int stackTop() {
		if(top != null) {
			return top.data;
		}
		return -1;
	}
	
	public boolean isEmpty() {
		return top == null ? true : false;
	}
	
	public static void main(String[] args) {
		StackImplUsingLinkedList linkedList = new StackImplUsingLinkedList();
		linkedList.push(10);
		linkedList.push(20);
		linkedList.push(30);
		linkedList.push(40);
		linkedList.display();
		linkedList.pop();
		linkedList.display();
		System.out.println("Peek Stack Element: "+linkedList.peek(3));
		
		linkedList.pop();
		linkedList.display();
		linkedList.pop();
		linkedList.display();
		System.out.println("Peek Stack Element: "+linkedList.peek(3));
	}

	private void display() {
		if(top == null) {
			System.out.println("Stack Underflow");
		}
		
		Node ptr = top;
		
		while(ptr != null) {
			System.out.print(ptr.data+"->");
			ptr = ptr.next;
		}
		System.out.println();
	}
 }
