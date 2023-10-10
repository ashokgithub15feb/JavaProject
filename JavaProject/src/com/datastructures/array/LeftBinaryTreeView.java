package com.datastructures.array;

class Node {
	int data;
	Node left;
	Node right;
	Node next;
	
	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class BinaryTree {
	Node root;
	static int maxLevel;
	
	void leftView() {
		maxLevel = 0;
		leftViewUtil(root, 1);
	}

	private void leftViewUtil(Node node, int level) {
		if(node == null) {
			return;
		}
		
		if(maxLevel < level) {
			System.out.print(node.data+" ");
			maxLevel = level;
		}
		
		leftViewUtil(node.left, level+1);
		leftViewUtil(node.right, level+1);
	}
}
public class LeftBinaryTreeView {
	
	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(4);
		binaryTree.root.left = new Node(5);
		binaryTree.root.right = new Node(2);
		binaryTree.root.right.left = new Node(3);
		binaryTree.root.right.right = new Node(1);
		binaryTree.root.right.left.left = new Node(6);
		binaryTree.root.right.left.right = new Node(7);
		
		
		
		binaryTree.leftView();
	}
}
