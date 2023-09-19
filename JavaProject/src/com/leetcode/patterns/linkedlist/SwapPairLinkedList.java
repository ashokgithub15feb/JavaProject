package com.leetcode.patterns.linkedlist;

public class SwapPairLinkedList {

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
		
		SwapPairLinkedList swapPairLinkedList = new SwapPairLinkedList();
		
		ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        
        head.next = second;
        second.next = third;
        third.next = fourth;

        ListNode h = head;
        while(h != null)
        {
        	System.out.print(h.val +" -> ");
        	h = h.next;
        }
        System.out.println("null");
        System.out.println("============================");
        
        ListNode result = swapPairLinkedList.swapPair(head);
        System.out.println("==============Result==============");
        while(result != null)
        {
        	System.out.print(result.val +" -> ");
        	result = result.next;
        }
        System.out.println("null");
	}

	private ListNode swapPair(ListNode head) {
		
		ListNode dummy = new ListNode(-1);
		ListNode prev = dummy;
		ListNode curr = head;
		dummy.next = head;
		
		while(curr != null && curr.next != null)
		{
			prev.next = curr.next;
			curr.next = curr.next.next;
			prev.next.next = curr;
			
			ListNode p = prev;
			while(p != null)
			{
				System.out.print(p.val + " -> ");
				p = p.next;
			}
			System.out.println("null");
			System.out.println("------------------------");
			curr = curr.next;
			prev = prev.next.next;
		}
		
		return dummy.next;
	}
}
