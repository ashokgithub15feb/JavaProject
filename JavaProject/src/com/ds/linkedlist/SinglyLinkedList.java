package com.ds.linkedlist;

public class SinglyLinkedList {

	public static void main(String[] args) {
		
		int val1 = 10;
		int val2 = 20;
		int val3 = 30;
		int val65 = 30;
		int val66 = 322;
		
		
		//--------------Insert at start--------------------
		LinkedListImpl list = new LinkedListImpl();
		list.display();
		list.insertAtStart(val1);
		list.display();
		list.insertAtStart(val2);
		list.display();
		list.insertAtStart(val3);
		list.insertAtStart(val65);
		list.insertAtStart(val66);
		
		list.display();
		
		//--------------Insert at end--------------------
		int val4 = 40;
		int val5 = 50;
		
		list.insertAtEnd(val4);
		list.display();
		list.insertAtEnd(val5);
		list.display();
		
		//--------------Insert at position--------------------
		int val6 = 60;
		int pos = 4;
		
		list.insertAtPos(val6, pos);
		list.display();
		
		//--------------deletion at position--------------------
		
//		int delPosFirst = 1;
//		int delPosLast = 5;
//		int delPosMiddle = 4;
//		int delPosMiddle3 = 3;
//		int delPosMiddle4 = 2;
//		
//		
//		list.deleteAtPos(delPosFirst);
//		list.display();
//		list.deleteAtPos(delPosLast);
//		list.display();
//		list.deleteAtPos(delPosMiddle);
//		list.display();
//		list.deleteAtPos(delPosMiddle3);
//		list.display();
//		list.deleteAtPos(delPosMiddle4);
		list.display();
		
	 /*
		Empty Singly Linked List
		10
		20->10
		30->20->10
		30->20->10->40
		30->20->10->40->50
		30->20->10->60->40->50
		20->10->60->40->50
		20->10->60->40
		20->10->60
		20->10
		20 
	 */
		
		list.reverse();
		
		list.middle();
		
		int duplidate = list.searchDuplicate(30);
		System.out.println("Duplicate Element present in Linked List: "+duplidate);
		
		list.removeDuplicate(30);
		System.out.println("Duplicate element Removed from Linked List: ");
		list.display();
		
		
		System.out.println("Searched Element: "+list.search(30));
		
		list.middleElement();
		
		list.middleElementRecursively();
		
		list.findKthNodeData(3);
		list.findKthNodeData(8);
		list.findKthNodeData(7);
		list.findKthNodeData(6);
		
		System.out.println("================================================");
		
		list.deleteAtPos(1);
		
		list.insertAtStart(50);
		list.insertAtEnd(10);
		list.deleteAtPos(4);
		list.insertAtPos(100, 4);
		list.display();
		list.findBalancedNode(100);
		
		System.out.println("======================================");

		list.findKthElementRecursively(3);
		
		
		System.out.println("=================================");
		list.display();
		
		/* Create a loop for testing */
//		list.start.link.link.link.link.link = list.start.link.link;
//		list.display();
//		list.detectLookInLinkedList();
		
		System.out.println("=============================================");
		list.rotate(4);
		list.display();
		
		
		
		System.out.println("==================================================");
		
		list.reverseMenual();
		list.display();
		
		
		System.out.println("===================================================");
		list.sortLibkedList();
		list.display();
		
	}
}

class Node
{
	int data;
	Node link;
	
	Node()
	{
		link = null;
		data  = 0;
	}
	
	Node(int d, Node n)
	{
		data = d;
		link = n;
	}
}

class LinkedListImpl
{
	Node start;
	Node end;
	int size;
	
	LinkedListImpl()
	{
		start = null;
		end = null;
		size = 0;
	}
	
	public void insertAtStart(int val)
	{
		Node nptr = new Node(val, null);
		size++;
		
		//first node - value = 10 and link = null;
		if(start == null)
		{
			start = nptr;
			end = nptr;
		}
		//second node - value = 20 and link = null;
		else
		{
			nptr.link=start;
			start = nptr;
		}
	}
	
	public int search(int search)
	{
		Node ptr = start;
		
		while(ptr != null)
		{
			if(ptr.data == search)
			{
				return ptr.data;
			}
			ptr = ptr.link;
		}
		
		return 0;
	}
	
	public int searchDuplicate(int searchData)
	{
		Node ptr = start;
		Node ptr1 = start;
		
		while(ptr != null)
		{
			if(ptr.data == searchData)
			{
				while(ptr1 != null)
				{
					if(ptr.data == ptr1.data)
					{
						return ptr.data;
					}
					ptr1 = ptr1.link;
				}
			}
			ptr = ptr.link;
		}
		
		return 0;
	}
	
	public void removeDuplicate(int searchData)
	{
		Node ptr = start;
		Node ptr1 = start;
		int index = 0;
		while(ptr != null)
		{
			if(ptr.data == searchData)
			{
				while(ptr1 != null)
				{
					if(ptr.data == ptr1.data)
					{
//						removedDuplicateElementFromLinkedList(ptr, ptr.data);
						removedDuplicateElementFromLinkedList(index);
					}
					ptr1 = ptr1.link;
					index++;
				}
			}
			ptr = ptr.link;
			index++;
		}
	}
	
	private void removedDuplicateElementFromLinkedList(int index) {
		deleteAtPos(index);
	}

//	private void removedDuplicateElementFromLinkedList(Node ptr, int data) {
//		
//		
//	}

	public void removeCycleFromLinkedList()
	{
		
	}
	
	public void reverse()
	{
		reverse(start);
	}
	
	public void reverse(Node node)
	{
		if(node == null)
		{
			return;
		}
		
		reverse(node.link);
		
		System.out.print(node.data+" ");
	}
	
	public void reverseMenual()
	{
		reverseMenual(start);
	}
	
	public Node reverseMenual(Node start_1)
	{
		Node current = start_1;
		Node prev = null;
		Node next = null;
		
		while(current != null)
		{
			next = current.link;
			current.link = prev;
			prev = current;
			current = next;
		}
		
		start = prev;
		
		return start;
	}
	
	public void middle()
	{
		Node current = start;
		  int length = 0;
		  Node middle = start;

		  while(current.link != null){
			  
		      length++;
		      if(length%2 ==0){
		          middle = middle.link;
		      }
		      current = current.link;
		  }

		  if(length%2 == 1){
		      middle = middle.link;
		  }

		  System.out.println("\nlength of LinkedList: " + length);
		  System.out.println("middle element of LinkedList : " + middle.data);
	}
	
	public void middleElement()
	{
		Node fast = start;
		Node slow = start;
		
		if(start != null)
		{
			while(fast != null && fast.link != null)
			{
				fast = fast.link.link;
				slow = slow.link;	
			}
		}
		
		System.out.println("Middle Element is: "+slow.data);
		
	}
	
	public void sortLibkedList()
	{
		sort(start);
	}

	Node sorted = null;
	
	private void sort(Node start) {
		
		sorted = null;
		Node current = start;
		
		while(current != null)
		{
			Node link = current.link;
			
			sortedInsert(current);
			
			current = link;
		}
	}

	private void sortedInsert(Node current) {
		
		if(sorted == null || sorted.data >= current.data)
		{
			current.link = sorted;
			sorted = current;
		}
		else
		{
			Node current_1 = sorted;
			
			while(current_1.link != null && current_1.link.data < current.data)
			{
				current_1 = current_1.link;
			}
			current.link = current_1.link;
			current_1.link = current;
		}
		
	}

	private Node mid = null;
	private int n = 1;
	
	public void middleElementRecursively()
	{
		middleElement(start);
	}
	
	public void middleElement(Node start)
	{
		Node head = start;
		
		if(head == null) 
		{
			n = (n) / 2;
			return;
		}
		
		n = n + 1;
		
		middleElement(head.link);
		
		n = n - 1;
		
		if(n == 0)
		{
			mid = head;
			System.out.println("Middle Element using middleElementRecursively is: "+mid.data);
			return;
		}
	}
	
	
	public void findKthNodeData(int index)
	{
		Node ptr = start;
		
		if(index <= size)
		{
			for(int i=1; i<=size; i++)
			{
				if(ptr != null)
				{
					if(i == index)
					{
						System.out.println("Kth "+index+" Element is: "+ptr.data);
						return;
					}
				}
				ptr = ptr.link;
			}
		}
		else
		{
			System.out.println("Kth "+index+" Element not present");
		}
	}
	
	
	public void detectLookInLinkedList()
	{
		Node slow = start;
		Node fast = start;
		boolean isDetectedLoop = false;
		while(slow != null && fast != null && fast.link != null)
		{
			slow = slow.link;
			fast = fast.link.link;
			
			if(slow == fast)
			{
				isDetectedLoop = true;
				return;
			}
		}
		
		if(isDetectedLoop)
		{
			System.out.println("Found Loop");
		}
		else
		{
			System.out.println("Not found Loop");
		}
	}
	
	
	
	public void findKthElementRecursively(int n)
	{
		findNthElementRecursively(start, n);
	}
	
	int count;
	int data;
	
	private void findNthElementRecursively(Node head, int n2) {
		
		// Initialize  
	    Node nth_last = new Node();  
	    count = 0;  
	  
	    // find nth node from the last  
	    findNthFromLast(head, n, nth_last);  
	  
	    // if node exists, then print it  
	    if (nth_last != null) {
	    	System.out.println("Nth node from last is: " + data);
	    }
	}

	private void findNthFromLast(Node head, int n2, Node nth_last) {
		
		// if list is empty  
	    if (head == null)  
	        return;  
	  
	    // recursive call  
	    findNthFromLast(head.link, n, nth_last);  
	  
	    // increment count  
	    count = count + 1;  
	      
	    // if true, then head is the 
	    // nth node from the last  
	    if (count == n)  
	    { 
	        data = head.data;  
	    } 
	}
	
	

	public void findBalancedNode(int balance)
	{
		System.out.println("Find balance "+balance+ " Node is: "+findBalancedNode(start, balance));
	}
	
	private int findBalancedNode(Node head, int balance) {
		
		int totalSum = 0;
		
		Node current = head;
		
		while(current != null)
		{
			totalSum += current.data;
			current = current.link;
		}
		
		int currentSum = 0;
		int remainingSum = 0;
		
		current = head;
		
		while(current != null)
		{
			remainingSum = totalSum - (currentSum + current.data);
			
			if(currentSum == remainingSum)
			{
				return current.data;
			}
			
			currentSum = currentSum + current.data;
			current = current.link;
		}
		
		return -1;
	}
	
	
	public void rotate(int k)
	{
		if(k == 0)
		{
			return;
		}
		
		int count = 1;
		Node current = start;
		
		while(count < k && current != null)
		{
			current = current.link;
			count++;
		}
		
		if(current == null)
		{
			return;
		}
		
		Node kthNode = current;
		
		while(current.link !=null)
		{
			current = current.link;
		}
		
		current.link = start;
		
		start = kthNode.link;
		
		kthNode.link = null;
	}
	
	

	public void insertAtEnd(int val)
	{
		Node nptr = new Node(val, null);
		size++;
		
		//check existing linked list contain any data or not
		if(start == null)
		{
			start = null;
			end = null;
		}
		//if contain the insert at end of the linked list
		else
		{
			end.link = nptr;
			end = nptr;
		}
	}
	
	public void insertAtPos(int val, int pos)
	{
		Node nptr = new Node(val, null);
		size++;
		
		Node ptr = start;
		pos = pos - 1;

		for(int i=1; i<size ; i++)
		{
			if(i == pos)
			{
				Node tmp = ptr.link;
				ptr.link = nptr;
				nptr.link = tmp;
				break;
			}
			ptr = ptr.link;
		}
	}
	
	public void deleteAtPos(int pos)
	{
		if(pos == 1)
		{
			start = start.link;
			size--;
			return;
		}
		if(pos == size)
		{
			Node s = start;
			Node t = start;
			while(s != end)
			{
				t = s;
				s = s.link;
			}
			end = t;
			end.link = null;
			size--;
			return;
		}
		Node ptr  = start;
		pos = pos - 1;
		for(int i=1; i<size-1;i++)
		{
			if(i == pos)
			{
				Node tmp = ptr.link;
				tmp = tmp.link;
				ptr.link = tmp;
				break;
			}
			ptr = ptr.link;
		}
		size--;
	}
	
	
	
	public void display()
	{
		if(size == 0)
		{
			System.out.print("Empty Singly Linked List\n");
			return;
		}
		
		if(start.link == null)
		{
			System.out.println(start.data);
			return;
		}
		
		Node ptr = start;
		
		System.out.print(start.data+"->");
		
		ptr = start.link;
		
		while(ptr.link != null)
		{
			System.out.print(ptr.data+"->");
			ptr = ptr.link;
		}
		System.out.print(ptr.data+"\n");
	}
}



















