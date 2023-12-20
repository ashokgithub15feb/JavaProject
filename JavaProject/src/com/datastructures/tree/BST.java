package com.datastructures.tree;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BST {

	private BSTNode root;

	public BST() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void insert(int data) {
		root = insert(root, data);
	}

	private BSTNode insert(BSTNode node, int data) {

		if (node == null) {
			node = new BSTNode(data);
		} else {
			if (data <= node.data) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}
		return node;
	}

	public BSTNode delete(int key)
	{
		return root = delete(root, key);
	}
	
	public BSTNode delete(BSTNode node, int key)
	{
		BSTNode p = null;
		BSTNode p2 = null;
		
		BSTNode n = null;

		if(recursiveSearch(key)) {
			if(node == null) {
				return null;
			}
			
			if(node.data == key)
			{
				BSTNode leftTree = node.left;
				BSTNode rightTree = node.right;
				
				if(leftTree == null && rightTree == null)
				{
					return null;
				}
				else if(leftTree == null)
				{
					p = rightTree;
					return p;
				}
				else if(rightTree == null)
				{
					p2 = leftTree;
					return p2;
				}
				else
				{
					p2 = rightTree;
					p = rightTree;
					
					while(p.left != null)
					{
						p = p.left;
					}
					
					p.left = leftTree;
					return p2;
				}
			}
			
			if(key < node.data)
			{
				n = delete(node.left, key);
				node.left = n;
			}
			else
			{
				n = delete(node.right, key);
				node.right = n;
			}
		}
		else {
			System.out.println("Deleted element not found in tree: "+key);
			return null;
		}
		return node;
	}

	private boolean search(int k) {
		return search(root, k);
	}

	private boolean search(BSTNode node, int k) {
		boolean found = false;
		while((node != null) && !found) {
			int nodeValue = node.data;
			
			if(k < nodeValue) {
			node = node.left;
			}
			else if(k > nodeValue) {
				node = node.right;
			}
			else {
				found = true;
				break;
			}
			
			found = search(node, nodeValue);
		}
		return found;
	}

	public void inodore() {
		System.out.println("In-dore");
		inorder(root);
	}

	private void inorder(BSTNode node) {
		if(node != null) {
			inorder(node.left);
			System.out.print(node.data+"->");
			inorder(node.right);
		}
	}
	
	public void preodore() {
		System.out.println("Pre-Order");
		preorder(root);
	}

	private void preorder(BSTNode node) {
		if(node != null) {
			System.out.print(node.data+"->");
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public void postodore() {
		System.out.println("Post-dore");
		postodore(root);
	}

	private void postodore(BSTNode node) {
		if(node != null) {
			postodore(node.left);
			postodore(node.right);
			System.out.print(node.data+"->");
		}
	}

	public void preOrder() {
		preOrder(root);
	}
	public void preOrder(BSTNode t) {
		
		Stack<BSTNode> stack = new Stack<BSTNode>();
		
		while(t != null || stack.isEmpty()) {
			if(t != null) {
				System.out.print(t.data+"->");
				
				stack.push(t);
				
				t = t.left;
			}
			else {
				t = stack.pop();
				t = t.right;
			}
		}
	}
	
	public void postOrder() {
		postOrder(root);
	}
	public void postOrder(BSTNode t) {
		
		Stack<BSTNode> stack = new Stack<BSTNode>();
		
		while(t != null || stack.isEmpty()) {
			if(t != null) {
				System.out.print(t.data+"->");
				
				stack.push(t);
				
				t = t.left;
			}
			else {
				t = stack.pop();
				t = t.right;
			}
		}
	}
	
	public void inOrder() {
		inOrder(root);
	}
	public void inOrder(BSTNode t) {
		
		Stack<BSTNode> stack = new Stack<BSTNode>();
		
		while(t != null || stack.isEmpty()) {
			if(t != null) {
				stack.push(t);
				t = t.left;
			}
			else {
				t = stack.pop();
				System.out.print(t.data+"->");
				t = t.right;
			}
		}
	}
	
	public void countingNode() {
		
		int count = countingNode(root);
		System.out.println("Counting BST Node "+count);
	}
	
	private int countingNode(BSTNode node) {
		
		int x = 0;
		int y = 0;
		
		if(node != null) {
			x = countingNode(node.left);
			y = countingNode(node.right);
			
			return x + y + 1;
		}
		return 0;
	}
	
	public void countingNodeDegreeNode() {
		
		int count = countingNodeDegreeNode(root);
		System.out.println("Counting DegreeNode BST Node "+count);
	}

	private int countingNodeDegreeNode(BSTNode node) {
		
		int x = 0;
		int y = 0;
		
		if(node != null) {
			x = countingNode(node.left);
			y = countingNode(node.right);
			
			if(node.left != null && node.right != null) {
				return x + y + 1;
			}
			else {
				return x + y;
			}
		}
		return 0;
	}
	
	private void fun() { 
		int count = fun(root);
		System.out.println("fun BST Node "+count);
	}
	
	private int fun(BSTNode node) {
		
		int x = 0;
		int y = 0;
		
		if(node != null) {
			x = countingNode(node.left);
			y = countingNode(node.right);
			
			if(x >  y) {
				return x + 1;
			}
			else {
				return y + 1;
			}
		}
		return 0;
	}

	public void countingLeafNode() {
		
		int count = countingLeafNode(root);
		System.out.println("Counting countingLeafNode Node "+count);
	}

	private int countingLeafNode(BSTNode node) {
		
		int x = 0;
		int y = 0;
		
		if(node != null) {
			x = countingNode(node.left);
			y = countingNode(node.right);
			
			if(node.left == null && node.right == null) {
				return x + y + 1;
			}
			else {
				return x + y;
			}
		}
		return 0;
	}
	
	public void countingLeafNodeDegreeOneOrTow() {
		
		int count = countingLeafNodeDegreeOneOrTow(root);
		System.out.println("Counting countingLeafNodeDegreeOneOrTow "+count);
	}

	private int countingLeafNodeDegreeOneOrTow(BSTNode node) {
		
		int x = 0;
		int y = 0;
		
		if(node != null) {
			x = countingNode(node.left);
			y = countingNode(node.right);
			
			if(node.left != null || node.right != null) {
				return x + y + 1;
			}
			else {
				return x + y;
			}
		}
		return 0;
	}
	
	public boolean recursiveSearch(int key) {
		
		BSTNode result = recursiveSearch(root, key);
		boolean isFlag = false;
		
		if(result != null) {
			System.out.println("Search Node Using Recursive: "+result);
			isFlag = true;
			return isFlag;
		}
		else {
			System.out.println("Search element not present in tree: "+key);
			return isFlag;
		}
		
	}
	
	public BSTNode recursiveSearch(BSTNode node, int key) {

		if (node == null) {
			return null;
		}

		if (key == node.data) {
			return node;
		} else if (key < node.data) {
			return recursiveSearch(node.left, key);
		} else {
			return recursiveSearch(node.right, key);
		}
	}
	
	
	public void iterativeSearch(int key) {
		
		BSTNode result = iterativeSearch(root, key);
		System.out.println("Search Node Using Iterative: "+result);
	}
	
	public BSTNode iterativeSearch(BSTNode node, int key) {

		if (node == null) {
			return null;
		}
		
		while(node != null) {
			if (key == node.data) {
				return node;
			} else if (key < node.data) {
				node = node.left;
			} else {
				node = node.right;
			}
		}
		
		return null;
	}
	
	public void insertNewNode(int key) {
		
		insertNewNode(root, key);
	}
	
	private void insertNewNode(BSTNode node, int key) {
		
		BSTNode r = null;
		
		while(node != null) {
			r = node;
			
			if(key == node.data) {
				return;
			}
			else if(key < node.data) {
				node = node.left;
			}
			else {
				node = node.right;
			}
		}
		
		BSTNode nptr = new BSTNode(key);
		
		if(nptr.data < r.data) {
			r.left = nptr;
		}
		else {
			r.right = nptr;
		}
	}
	
	public void insertNewNodeUsingRecursion(int key) {
		
	root = insertNewNodeUsingRecursion(root, key);
	}
	
	private BSTNode insertNewNodeUsingRecursion(BSTNode node, int key) {

		if (node == null) {
			return null;
		}

		if (key == node.data) {
			return node;
		} else if (key < node.data) {
			node.left = insertNewNodeUsingRecursion(node.left, key);
		} else if (key > node.data){
			node.right = insertNewNodeUsingRecursion(node.right, key);
		}

		BSTNode nptr = new BSTNode(key);

		if (nptr.data < node.data) {
			node.left = nptr;
		} else {
			node.right = nptr;
		}
		return node;
	}

	public void deleteNode(int key) {
		
		root = deleteNode(root, key);
	}
	
	private BSTNode deleteNode(BSTNode p, int key) {
		
		BSTNode q = null;			
		
		if(p == null) {
			return null;
		}
		
		if(p.left == null && p.right == null) {
			if(p == root) {
				root = null;
			}
			
			p = p.left;
			return null;
		}
		
		if(key < p.data) {
			p.left = deleteNode(p.left, key);
		}
		else if(key > p.data) {
			p.right = deleteNode(p.right, key);
		}
		else {
			
			if(height(p.left) > height(p.right)) {
				q = inorderPredecessor(p.left);
				p.data = q.data;
				p.left = deleteNode(p.left, q.data);
			}
			else {
				q = inorderSuccessor(p.right);
				p.data = q.data;
				p.right = deleteNode(p.right, q.data);
			}
		}
		return null;
	}

	private int height(BSTNode p) {
		
		int x = 0;
		int y = 0;
		
		if(p == null) {
			return 0;
		}
		
		x = height(p.left);
		y = height(p.right);
		
		return x > y ? x + 1 : y + 1;
	}
	
	private BSTNode inorderPredecessor(BSTNode p) {
		
		while(p != null && p.right != null) {
			p = p.right;
		}
		
		return p;
	}
	
	private BSTNode inorderSuccessor(BSTNode p) {
		
		while(p != null && p.left != null) {
			p = p.left;
		}
		
		return p;
	}
	
	public static void main(String[] args) {

		BST bst = new BST();
		bst.insert(30);
		bst.insert(15);
		bst.insert(50);
		bst.insert(10);
		bst.insert(20);
		bst.insert(40);
		bst.insert(60);
		//bst.preOrder();
		//System.out.println();
		//bst.inOrder();
		//System.out.println();
		bst.preodore();
		System.out.println();
		bst.inodore();
		System.out.println();
		bst.postodore();
		System.out.println();
		System.out.println("Search 181 in BST  = "+bst.search(181));
	//	bst.delete(13);
		
		int i=10;
		
		if(bst.search(i)) { //The local variable i may not have been initialized
			i = 10;
		}
		
		
		//bst.preOrder();
		
		
		//bst.levelOrder();
		
		bst.countingNode();
		bst.countingNodeDegreeNode();
		bst.fun();
		bst.countingLeafNode();
		bst.countingLeafNodeDegreeOneOrTow();
		
		
		System.out.println("=========");
		
		bst.recursiveSearch(15);
		
		bst.iterativeSearch(15);
		
		System.out.println("=========");
		
		//bst.insertNewNode(38);
	//	bst.inodore();
		System.out.println();
		System.out.println("=========");
		
		//bst.insertNewNodeUsingRecursion(39);
		//bst.inodore();
		System.out.println();
		
		System.out.println("=============================");
		
		System.out.println("Delete Node: "+bst.delete(20));
		System.out.println();
		bst.preodore();
		System.out.println();
		
		bst.insert(70);
		bst.insert(65);
		bst.insert(80);
		
		System.out.println("Deleted Node: "+bst.delete(30));		
		bst.preodore();
	}

	private void levelOrder() {
		levelOrder(root);
	}

	private void levelOrder(BSTNode node) {
		
		Queue<Integer> q = new ConcurrentLinkedQueue<Integer>();
		
		
	}

}
