package com.leetcode.patterns.fastandslowpointer;

import com.leetcode.patterns.fastandslowpointer.LinkedListCycle.Node;

public class LinkedListCycle {

	Node start;

	static class Node {
		int val;
		Node next;

		Node(int x) {
			this.val = x;
			this.next = null;
		}

	}

	// add first
	void addFirstNode(int x) {
		Node newNode = new Node(x);

		if (start == null) {
			start = new Node(x);
			return;
		}

		newNode.next = start;
		start = newNode;
	}
	
	//add last
	void addLastNode(int x) {
		Node newNode = new Node(x);

		if (start == null) {
			start = new Node(x);
			return;
		}

		Node currNode = start;
		
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	Node addLastNode1(int x) {
		Node newNode = new Node(x);

		if (start == null) {
			start = new Node(x);
			return start;
		}

		Node currNode = start;
		
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
		
		return currNode;
	}
	
	void printList() {
		if (start == null) {
			System.out.println("Empty Linked List");
			return;
		}

		Node currNode = start;

		while (currNode != null) {
			System.out.print(currNode.val + " -> ");
			currNode = currNode.next;
		}
		
		System.out.println("null");
	}
	
	boolean hasCycle(Node start)
	{
		if(start == null)
            return false;
        
        Node slow = start;
        Node fast = start.next;
        
        while(slow != fast)
        {
            if(fast == null || fast.next == null)
            {
                return false;
            }
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return true;
	}
	
	 public Node detectCycle(Node head) {
	        
	        if(head == null || head.next == null) return null;
	        
	        Node fast = head;
	        Node slow = head;
	        
	        while(fast != null && fast.next != null)
	        {
	            slow = slow.next;
	            fast = fast.next.next;
	            
	            if(slow == fast)
	            {
	                break;
	            }
	        }
	        
	        if(fast == null || fast.next == null)
	        {
	            return null;
	        }
	        
	        fast = head;
	        
	        if(fast != slow)
	        {
	            slow = slow.next;
	            fast = fast.next;
	        }
	        
	        return fast;
	    }
	
	 
	 public Node deleteDuplicates(Node head) {
	        
	        Node curr = head;
	        
	        while(curr != null && curr.next != null)
	        {
	            if(curr.val == curr.next.val)
	            {
	                curr.next = curr.next.next;
	            }
	            else
	            {
	                curr = curr.next;
	            }
	        }
	        
	        return head;
	    }
	 
	Node middleElement(Node start)
	{
		Node slow = start;
		Node fast = start;
		
		if(start != null)
		{
			while(fast != null && fast.next != null)
			{
				slow = slow.next;
				fast= fast.next.next;
			}
		}
		
		return slow;
	}

	
	public boolean isPalindrome(Node start) {
	
		Node slow = start;
		Node fast = start;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		while(fast != null)
		{
			slow = slow.next;
		}
		
		Node reverseNode = reverse(slow);
		
		while(reverseNode != null)
		{
			if(reverseNode.val != start.val)
			{
				return false;
			}
			else
			{
				reverseNode = reverseNode.next;
				start = start.next;
			}
		}
		
		return true;
	}
		
	private Node reverse(Node start) {
		
		Node prev = null;
		
		while(start != null)
		{
			Node tempNode = start.next;
			start.next = prev;
			prev = start;
			start = tempNode;
		}
		
		return prev;
	}
	
	public Node removedNode(Node start, int val)
	{
		if(start == null)
		{
			return start;
		}
		
		Node prev = null;
		Node curr = start;
		
		while(curr != null)
		{
			if(curr.val == val)
			{
				if(prev != null)
				{
					start = curr.next;
				}
				else
				{
					//prev = start;
					prev.next = curr.next;
				}
			}
			else
			{
				prev = curr;
				curr = curr.next;
			}
		}
		
		return start;
	}
	
	public Node addTwoNumbers(Node l1, Node l2) {
		
		Node dummy = new Node(0);
		Node p = l1;
		Node q = l2;
		Node curr = dummy;
		int carry = 0;
		
		while(p != null || q != null)
		{
			int x = p != null ? p.val : 0;
			int y = q != null ? q.val : 0;
			
			int sum = x + y + carry;
			
			carry = sum / 10;
			
			curr.next = new Node(sum % 10);
			
			curr = curr.next;
			
			if(p != null)
				p = p.next;
			
			if(q != null)
				q = q.next;
		}
		
		if(carry > 0)
		{
			curr.next = new Node(carry);
		}
		
		return dummy.next;
	}
	
	public Node removeNthFromEnd(Node start, int n) {
        
		Node dummy = new Node(0);
		Node curr = dummy;
		Node nth = dummy;
        dummy.next = start;
        
        for(int i=1; i<=n+1; i++)
        {
            curr = curr.next;
        }
        
        while(curr != null)
        {
            curr = curr.next;
            nth = nth.next;
        }
        
        nth.next = nth.next.next;
        
        return dummy.next;
    }
	
	public Node sortList(Node start)
	{
		if(start == null || start.next == null)
			return start;
		
		Node mid = middleNode(start);
		Node leftNode = sortList(start);
		Node rightNode = sortList(mid);
		
		Node mergedNode = merge(leftNode, rightNode);
		
		return mergedNode;
	}

	private Node merge(Node leftNode, Node rightNode) {
		
		Node dummy = new Node(0);
		Node curr = dummy;
		
		while(leftNode != null && rightNode != null)
		{
			if(leftNode.val <= rightNode.val)
			{
				curr.next = leftNode;
				leftNode = leftNode.next;
			}
			else
			{
				curr.next = rightNode;
				rightNode = rightNode.next;
			}
			
			curr = curr.next;
		}
		
		curr.next = leftNode != null ? leftNode : rightNode;
		
		return dummy.next;
	}

	private Node middleNode(Node start) {
		
		Node slow = start;
		Node fast = start.next;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		Node mid = slow.next;
		
		slow.next = null;
		
		return mid;
	}

	public static void main(String[] args) {

		LinkedListCycle ll = new LinkedListCycle();

		
		ll.addFirstNode(1);
		ll.addLastNode(2);
		ll.addLastNode(2);
		ll.addLastNode(1);
		//ll.addLastNode(5);
		
		ll.printList();
		
		boolean palindrome = ll.isPalindrome(ll.start);
		if(palindrome)
		{
			System.out.println("Linked List is palindrome: "+palindrome);
		}
		else
		{
			System.out.println("Linked List is not palindrome: "+palindrome);
		}
		
		//Node removedNode = ll.removedNode(ll.start, 2);
		//ll.start = removedNode;
		ll.printList();
		
		//--------------------
		
		
		//----------------------
		
		//Node middleNode = ll.middleElement(ll.start);
		
		//while(middleNode != null && middleNode.next != null)
		//{
		//	System.out.print(middleNode.val+" -> ");
		//	middleNode = middleNode.next;
		//}
		//System.out.print(middleNode.val+" -> ");
	//	System.out.println("null");sb
//		Node start = ll.addLastNode1(3);
//		
//		start.next = ll.addLastNode1(2);
//		start.next.next = ll.addLastNode1(0);
//		start.next.next.next = ll.addLastNode1(-4);
//		
//		start.next.next.next.next = start.next;
//
//		System.out.println("Loop Found: "+ll.hasCycle(start));
		
	}
}
