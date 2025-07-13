package com.interviews.leetcode.easy;

public class LinkedListCycle {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(4);
		head.next.next.next = head.next;
		
		boolean result = cycleDetect(head);
		
		System.out.println("Cycle Detect Result: "+result);
	}

	private static boolean cycleDetect(ListNode head) {
		
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
}
