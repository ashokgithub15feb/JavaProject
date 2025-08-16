package com.interviews.companies.siemens;

public class Node {

	int data;
	Node next;
	
	Node() {
		data = 0;
		next = null;
	}
	
	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	Node(Node next) {
		this.next = next;
	}
}
