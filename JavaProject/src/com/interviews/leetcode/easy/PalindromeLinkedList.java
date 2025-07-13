package com.interviews.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		
		boolean result = isPalindromeLinkedList(head);
		
		System.out.println("Result: "+result);
	}

	private static boolean isPalindromeLinkedList(ListNode head) {
		
		if(head == null) {
			return false;
		}
		
		List<Integer> list = new ArrayList<Integer>();
		ListNode current = head;
		
		while(current != null) {
			list.add(current.val);
			current = current.next;
		}
		
		int start = 0;
		int end = list.size() - 1;
		
		while(start < end) {
			
			if(list.get(start) != list.get(end)) {
				return false;
			}
			
			start++;
			end--;
			
		}
		return true;
	}
}
