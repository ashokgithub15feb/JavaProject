package com.leetcode.patterns.linkedlist;

public class SingleLinkedListImpl {

	Node head;

	// add first
	void addFirstNode(int x) {
		Node newNode = new Node(x);

		if (head == null) {
			head = new Node(x);
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	// add last
	void addLastNode(int x) {
		Node newNode = new Node(x);

		if (head == null) {
			head = new Node(x);
			return;
		}

		Node currNode = head;

		while (currNode.next != null) {
			currNode = currNode.next;
		}

		currNode.next = newNode;
	}

	public Node reverse(Node head)
	{
		Node prev = null;
		
		while(head != null)
		{
			Node temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}
		
		return prev;
	}
	
	void printList() {
		if (head == null) {
			System.out.println("Empty Linked List");
			return;
		}

		Node currNode = head;

		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}

		System.out.println("null");
	}
	
	void printList(Node head) {
		if (head == null) {
			System.out.println("Empty Linked List");
			return;
		}

		Node currNode = head;

		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}

		System.out.println("null");
	}
}
