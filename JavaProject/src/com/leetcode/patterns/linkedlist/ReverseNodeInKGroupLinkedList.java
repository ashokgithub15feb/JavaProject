package com.leetcode.patterns.linkedlist;

public class ReverseNodeInKGroupLinkedList {

	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public static void main(String[] args) {
		
		ReverseNodeInKGroupLinkedList groupLinkedList = new ReverseNodeInKGroupLinkedList();
		
		ListNode head = new ListNode(2);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(5);
        ListNode fifth = new ListNode(6);
        ListNode sixth = new ListNode(4);
        ListNode seventh = new ListNode(7);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        
        ListNode h = head;
        while(h != null)
        {
        	System.out.print(h.val +" -> ");
        	h = h.next;
        }
        System.out.println("null");
        System.out.println("============================");
        
        int k = 2;
        
        ListNode result = groupLinkedList.reverseNodeInKGroup(head, k);
        
        System.out.println("==============Result==============");
        while(result != null)
        {
        	System.out.print(result.val +" -> ");
        	result = result.next;
        }
        System.out.println("null");
        
	}

	private ListNode reverseNodeInKGroup(ListNode head, int k) {
		
		if(head == null || head.next == null)
			return head;
		if(k == 0) return head;
		
		int count = 0;
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		
		ListNode temp = dummy;
		
		while(temp.next != null)
		{
			temp = temp.next;
			count++;
		}
		
		temp = dummy;
		
		while(temp.next != null)
		{
			if(count < k)
			{
				break;
			}
			
			int nodes = k - 1;
			ListNode tempNext = temp.next;
			ListNode first = temp.next;
			ListNode second = first.next;
			
			while(nodes -- > 0)
			{
				ListNode next = second.next;
				second.next = first;
				first = second;
				second = next;
			}
			
			count -= k;
			
			temp.next = first;
			tempNext.next = second;
			temp = tempNext;
			
		}
		return dummy.next;
	}
}
