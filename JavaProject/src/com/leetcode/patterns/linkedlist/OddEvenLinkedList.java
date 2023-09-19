package com.leetcode.patterns.linkedlist;

public class OddEvenLinkedList {

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
		
		OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
		
		//ListNode head = new ListNode(1);
       // ListNode second = new ListNode(2);
        //ListNode third = new ListNode(3);
       // ListNode fourth = new ListNode(4);
        //ListNode fifth = new ListNode(5);
        
        
        //head.next = second;
        //second.next = third;
        //third.next = fourth;
        //fourth.next = fifth;
        //--------------
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
        
        ListNode result = oddEvenLinkedList.oddEvenLinkedList(head);
        
        System.out.println("==============Result==============");
        while(result != null)
        {
        	System.out.print(result.val +" -> ");
        	result = result.next;
        }
        System.out.println("null");
        
	}

	private ListNode oddEvenLinkedList(ListNode head) {
		
		if(head == null || head.next == null)
			return head;
		
		ListNode hodd = head;
		ListNode heven = head.next;
		ListNode odd = hodd;
		ListNode even = heven;
		
		while(even != null)
		{
			if(even.next != null) //if even -> next is not null
			{
				odd.next = even.next;
			}
			else //else even -> next is null than
			{
				odd.next = heven;
				return hodd;
			}
			
			odd = odd.next;
			
			even.next = odd.next;
			even = even.next;
		}
		odd.next = heven;
		
		return hodd;
	}
}
