package com.interviews.leetcode.medium;

class ListNode {
	int val;
	ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

}

public class RemoveNthNodeFromList {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		int n = 2;
		
		ListNode removeNthNodeFromList = removeNthNodeFromList(head, n);
		
		System.out.println(removeNthNodeFromList.val);
		removeNthNodeFromList = removeNthNodeFromList.next;
		System.out.println(removeNthNodeFromList.val);
		removeNthNodeFromList = removeNthNodeFromList.next;
		System.out.println(removeNthNodeFromList.val);
		removeNthNodeFromList = removeNthNodeFromList.next;
		System.out.println(removeNthNodeFromList.val);
	}

	private static ListNode removeNthNodeFromList(ListNode head, int n) {
		
		int length = 0;
		ListNode current = head;
		
		
		while(current != null) {
			length++;
			current = current.next;
		}
		
		if(n == length) {
			head = head.next;
			return head;
		}
		current = head;
		for(int i=0; i < length - n - 1; i++) {
			current = current.next;
		}
		
		current.next = current.next.next;
		
		return head;
	}
}
