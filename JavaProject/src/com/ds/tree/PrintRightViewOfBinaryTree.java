package com.ds.tree;

public class PrintRightViewOfBinaryTree {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right = new Node(3);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.right.right = new Node(8);
		
		tree.rightView();
		System.out.println();
		tree.leftView();
		
		
	}
}

class Node
{
	int data; 
    Node left, right; 
  
    Node(int item) { 
        data = item; 
        left = right = null; 
    } 
}

class MaxLevel
{ 
    int maxLevel; 
} 

/*class MaxLeftLevel
{ 
    int maxLeftLevel; 
} 
*/

class BinaryTree
{ 
	Node root;
	
	MaxLevel max = new MaxLevel();
	//MaxLeftLevel maxLeft = new MaxLeftLevel();
	
	int maxLeft = 0;

	//Recursive function to print right view of a binary tree.
	void rightViewUtil(Node node, int level, MaxLevel maxLevel)
	{
		if(node == null)
		{
			return;
		}
		
		if(maxLevel.maxLevel < level)
		{
			System.out.print(node.data+" ");
			maxLevel.maxLevel = level;
		}
		rightViewUtil(node.right, level+1, maxLevel);
		//rightViewUtil(node.left, level+1, maxLevel);
		
	}
	
	void leftViewUtil(Node node, int level, Integer maxLeftLevel)
	{
		if(node == null)
		{
			return;
		}
		
		if(maxLeftLevel < level)
		{
			System.out.print(node.data+" ");
			maxLeftLevel = level;
		}
		leftViewUtil(node.left, level+1, maxLeftLevel);
	}
	
	public void rightView()
	{
		rightView(root);
	}
	
	public void rightView(Node node)
	{
		rightViewUtil(node);
	}

	public void rightViewUtil(Node node)
	{
		rightViewUtil(node, 1, max);
	}
	
	public void leftView()
	{
		leftView(root);
	}
	
	public void leftView(Node node)
	{
		leftViewUtil(node);
	}

	public void leftViewUtil(Node node)
	{
		leftViewUtil(node, 1, maxLeft);
	}
}
