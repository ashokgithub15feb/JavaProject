package com.datastructures.stack;

class NodeStracture {
	char data;
	NodeStracture next;
	
	public NodeStracture(char data) {
		this.data = data;
		this.next = null;
	}
	
	public NodeStracture() {
	}
	
	
}
public class StackImplForParanthesisMatching {

	public NodeStracture top;
	private int size;
	
	public StackImplForParanthesisMatching() {
		this.top = null;
		this.size = 0;
	}
	
	public void push(char data) {
		NodeStracture nptr = new NodeStracture(data);
		
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
	
	public char pop() {
		char x = ' ';
		if(top == null) {
			System.out.println("Stack Underflow");
		}
		else {
			NodeStracture ptr = top;
			top = top.next;
			x = ptr.data;
			size--;
		}
		return x;
	}
	
	public int peek(char pos) {
		NodeStracture ptr = top;
		
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
	
	public char stackTop() {
		if(top != null) {
			return top.data;
		}
		return ' ';
	}
	
	public boolean isEmpty() {
		return top == null ? true : false;
	}


	private void display() {
		if(top == null) {
			System.out.println("Stack Underflow");
		}
		
		NodeStracture ptr = top;
		
		while(ptr != null) {
			System.out.print(ptr.data+"->");
			ptr = ptr.next;
		}
		System.out.println();
	}
 }
