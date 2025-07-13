package com.interviews.leetcode.easy;

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

public class DeleteDuplicateElementInLinkedList {

	public static void main(String[] args) {

		ListNode head = new ListNode();
		head.val = 1;
		head.next = new ListNode(1);
		head.next = new ListNode(2);

		ListNode result = deleteDuplicate(head);

		System.out.println(result.val);
		System.out.println(result.next.val);
	}

	private static ListNode deleteDuplicate(ListNode head) {

		ListNode current = head;

		while (current != null && current.next != null) {
			if (current.val == current.next.val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}

		return head;
	}
}
