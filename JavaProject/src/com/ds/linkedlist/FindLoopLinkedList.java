package com.ds.linkedlist;

import org.omg.CORBA.Current;

public class FindLoopLinkedList {

	Node head;
	
	class Node 
    { 
        int data; 
        Node next; 
        
        Node(int d) 
        {
        	data = d; 
        	next = null;
        } 
    } 
	
	public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    }
	
	public void detectLoop()
	{
		Node slow = head;
		Node fast = head;
		int detectLoop = 0;

		while(slow != null && fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
			{
				detectLoop = 1;
			}else
			{
				detectLoop = 0;
			}
		}
		
		if(detectLoop == 1)
		{
			System.out.println("Found Loop");
		}
		else
		{
			System.out.println("No Loop Found");
		}
	}

	public void removeLoopFromLinkedList()
	{
		Node slow = head;
		Node fast = head;
		int detectLoop = 0;
		
		while(slow != null && fast != null && fast.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow)
			{
				removerLoop(fast, slow);
				detectLoop = 1;
			}
			else
			{
				detectLoop = 0;
			}
		}
	}
	
	
	private void removerLoop(Node fast, Node slow) {
		
		
	}

	public static void main(String args[]) 
    { 
		FindLoopLinkedList llist = new FindLoopLinkedList(); 
  
        llist.push(20); 
        llist.push(4); 
        llist.push(15); 
        llist.push(10); 
        llist.push(60); 
        llist.push(80); 
        llist.push(10); 
//        llist.push(910); 
        
        llist.display();
        System.out.println();
        /*Create loop for testing */
       // llist.head.next.next.next.next = llist.head; 
  
        llist.detectLoop();
        
        System.out.println();
        llist.middleNode();
        
//        llist.reverLinkedListWithRecursion();
        
//        llist.reverLinkedListWithoutRecursion();
        
        llist.removeDuplicate();
        
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 8;
        
        llist.thirdNodeFromEnd(n3);
        
//        llist.thirdNodeFromFirst(n3);
    }
	
	
//	private void thirdNodeFromFirst(int n) {
//		
//		int start = 1;
//		Node fast = head;
//		Node slow = head;
//		
//		while(fast.next != null)
//		{
//			start++;
//			
//			if(start > n)
//			{
//				slow = slow.next;
//			}
//		}
//		
//		System.out.println("\n"+n+" Node from first Data is : "+slow.data);
//	}

	public void thirdNodeFromEnd(int n)
	{
		int start = 1;
		
		Node fast = head;
		Node slow = head;
		
		while(fast.next != null)
		{
			fast = fast.next;
			start++;
			
			if(start > n)
			{
				slow = slow.next;
			}
		}
		
		System.out.println("\n"+n+" Node from Last Data is : "+slow.data);
	}
	
	public void removeDuplicate()
	{
		Node ptr1 = head;
		Node ptr2 = null;

		while(ptr1 != null && ptr1.next != null)
		{
			ptr2 = ptr1;
			
			while(ptr2 != null && ptr2.next != null)
			{
				if(ptr1.data == ptr2.next.data)
				{
					Node dup = ptr2.next;
					ptr2.next = ptr2.next.next;
					System.gc();
				}else
				{
					ptr2 = ptr2.next;
				}
			}
			
			ptr1 = ptr1.next;
		}
		System.out.println();
		display();
	}
	
	private void reverLinkedListWithoutRecursion() {

		reverLinkedListWithoutRecursion(head);
	}

	private void reverLinkedListWithoutRecursion(Node head2) {

		Node forword = null;
		Node previous = null;
		Node currect = head;
		
		while(currect.next != null)
		{
			forword = currect.next;
			currect.next = previous;
			previous = currect;
			currect = forword;
			
		}
		
		head = currect;
		head.next = previous;
		System.out.println();
		display();
	}

	public void reverLinkedListWithRecursion()
	{
		reverLinkedListWithRecursion(head);
	}
	
	public void reverLinkedListWithRecursion(Node head)
	{
		if(head == null)
		{
			return;
		}
		
		reverLinkedListWithRecursion(head.next);
		
		System.out.print(head.data+" ");
	}
	
	public void middleNode()
	{
		int len = 0;
		Node ptr = head;
		Node middel = head;
		while(ptr.next != null)
		{
			len++;
			
			if(len % 2 == 0)
			{
				middel = middel.next;
			}
			ptr = ptr.next;
		}
		
		if(len % 2 == 1)
		{
			middel = middel.next;
		}
		
		System.out.println("Middle Node Length is: "+len);
		System.out.println("Middle Node Data is: "+middel.data);
	}
	
	public void display()
	{
		if(head == null)
		{
			System.out.println("Linked List ie Empty");
			return;
		}
		
		if(head.next == null)
		{
			System.out.print(head.data);
		}
		
		Node ptr = head;
		
		while(ptr.next != null)
		{
			System.out.print(ptr.data+"->");
			ptr = ptr.next;
		}
		System.out.print(ptr.data);
	}
}
