package com.interviews.leetcode.easy;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		System.out.println(head.val);
		System.out.println(head.next.val);
		System.out.println(head.next.next.val);
		System.out.println(head.next.next.next.val);
		System.out.println("=================");
		ListNode result = reverseLinkedList(head);
		
		System.out.println(result.val);
		System.out.println(result.next.val);
		System.out.println(result.next.next.val);
		System.out.println(result.next.next.next.val);
		
		
	}

	private static ListNode reverseLinkedList(ListNode head) {
		
		ListNode current = head;
		ListNode prev = null;
		ListNode next = current.next;
		
		while(current != null) {
			current.next = prev;
			prev = current;
			current = next;
			
			if(next != null) {
				next = current.next;
			}
		}
		
		head = prev;
		return head;
	}
}
