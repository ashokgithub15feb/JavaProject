package com.leetcode.patterns.linkedlist;

public class ReverseLinkedListMain {

	public static void main(String[] args) {
		
		SingleLinkedListImpl linkedListImpl = new SingleLinkedListImpl();
		linkedListImpl.addFirstNode(1);
		linkedListImpl.addFirstNode(2);
		linkedListImpl.addFirstNode(3);
		linkedListImpl.addFirstNode(4);
		linkedListImpl.addFirstNode(5);
		
		linkedListImpl.printList();
		Node reverseNode = linkedListImpl.reverse(linkedListImpl.head);
		
		linkedListImpl.printList(reverseNode);
	}
}
