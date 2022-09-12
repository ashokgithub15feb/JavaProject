package com.leetcode.patterns.linkedlist;

public class ReverseLinkedListII {

	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}
	
	public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        head = reverseBetween(head, 2, 4);
        
        while (head != null) {
            System.out.print(head.val+" -> ");//1 4 3 2 5
            head = head.next;
        }
        System.out.println("null");
    }

	private static ListNode reverseBetween(ListNode head, int left, int right) {
		
		ListNode prev = null;
		ListNode curr = head;
		int count = 1;
		
		while(count != left)
		{
			prev = curr;
			curr = curr.next;
			count++;
		}
		
		ListNode start = curr;
		while(count != right)
		{
			curr = curr.next;
			count++;
		}
		
		ListNode rest = curr.next;
		curr.next = null;
		
		ListNode newHead = reverse(start);
		
		if(prev != null)
		{
			prev.next = newHead;
		}
		
		curr = newHead;
		
		while(curr.next != null)
		{
			curr = curr.next;
		}
		
		curr.next = rest;
		
		if(left == 1)
			return newHead;
		else
			return head;
	}

	private static ListNode reverse(ListNode start) {
		
		ListNode prev = null;
		
		while(start != null)
		{
			ListNode temp = start.next;
			start.next = prev;
			prev = start;
			start = temp;
		}
		
		return prev;
	}

}
