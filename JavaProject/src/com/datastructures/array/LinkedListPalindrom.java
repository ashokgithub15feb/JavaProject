package com.datastructures.array;

import java.util.Stack;

public class LinkedListPalindrom {

	static boolean isPalindrome(Node head) {
		
		Node slow = head;
		boolean isPalindrom = true;
		Stack<Integer> stack = new Stack<Integer>();
		
		while(slow != null) {
			stack.push(slow.data);
			slow = slow.next;
		}
		
		while(head != null) {
			int i = stack.pop();
			
			if(head.data == i) {
				isPalindrom = true;
			}else {
				isPalindrom = false;
				break;
			}
			head = head.next;
		}
		return isPalindrom;
	}
	public static void main(String[] args) {
		
		Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        
        boolean condition = isPalindrome(one);
        
        System.out.println("isPalidrome :" + condition);
	}
	
	
}

//class Node {
//	int data;
//	Node next;
//	public Node(int data) {
//		this.data = data;
//		next = null;
//	}
//}