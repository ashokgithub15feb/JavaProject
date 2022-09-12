package com.leetcode.patterns.linkedlist;

public class RotateRightLinkedList {

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
		
		RotateRightLinkedList linkedList = new RotateRightLinkedList();
		
		ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        int rotateRightK = 2;
        
        head = linkedList.rotateRight(head, rotateRightK);
        
        while (head != null) {
            System.out.print(head.val+" -> ");//1 4 3 2 5
            head = head.next;
        }
        System.out.println("null");
        
        System.out.println("======");
        System.out.println(1 % 5);
        System.out.println(2 % 5);
        System.out.println(3 % 5);
        System.out.println(4 % 5);
        System.out.println(5 % 5);
        System.out.println(6 % 5);
        System.out.println(2 / 5);
        System.out.println("======");
        
	}
	
	public ListNode rotateRight(ListNode head, int k) {
		
		if(head == null || head.next == null) return head;
		if(k == 0) return head;
		
		int len = 1;
		ListNode newHead = head;
		ListNode tail = head;
		
		while(tail.next != null)
		{
			tail = tail.next;
			len++;
		}
		
		tail.next = head;
		
		k %= len;
		
		for(int i=0; i<len - k; i++)
		{
			tail = tail.next;
		}
		
		newHead = tail.next;
		tail.next = null;
		
		return newHead;
    }
}
