package com.leetcode.patterns.linkedlist;

public class ReverseNodesInKGroup {

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
		
		ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();
		
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
        
        ListNode result = reverseNodesInKGroup.reverseNodeInKGroup(head, k);
        
        System.out.println("==============Result==============");
        while(result != null)
        {
        	System.out.print(result.val +" -> ");
        	result = result.next;
        }
        System.out.println("null");
        
	}

	private ListNode reverseNodeInKGroup(ListNode head, int k) {
		
		if(head == null || head.next == null || k == 0 || k == 1) return head;
		
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode beforeStart = dummy;
		ListNode end = head;
		
		int i = 0;
		
		while(end != null)
		{
			i++;
			
			if(i % k  == 0)
			{
				ListNode start = beforeStart.next;
				ListNode temp = end.next;
				
				reverse(start, end);
				
				beforeStart.next = end;
				start.next = temp;
				beforeStart = start;
				end = temp;
			}
			else
			{
				end = end.next;
			}
		}
		
		return dummy.next;
	}

	private void reverse(ListNode start, ListNode end) {
		
		ListNode prev = null;
		ListNode curr = start;
		ListNode next = start.next;
		
		while(prev != end)
		{
			curr.next = prev;
			prev = curr;
			curr = next;
			if(next != null)
			{
				next = next.next;
			}
		}
	}
}
