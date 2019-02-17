package com.ds.avl.tree;

public class AVLImpl {

	
}

class AVLTree
{
	AVLNode root;
	
	AVLTree()
	{
		root = null;
	}
	
	public void insert(int data)
	{
		root = insert(data, root);
	}
	
	public AVLNode insert(int data, AVLNode t)
	{
		if(t == null)
		{
			t = new AVLNode(data);
		}
		else if(data < t.data)
		{
			t.left = insert(data, t.left);
			
			if(height(t.left) - height(t.right) == 2)
			{
				if(data < t.left.data)
				{
					t = rotateWithLeftChild(t);
				}
			}
		}
		return null;
	}
	
	private AVLNode rotateWithLeftChild(AVLNode t) 
	{
		AVLNode left = t.left;
		
		
		
		return null;
	}

	public int height(AVLNode t)
	{
		return t == null ? -1 : t.height;
	}
	
	public int max(int lhs, int rhs)
	{
		return lhs > rhs ? lhs :rhs;
	}
	
}

class AVLNode
{
	int data;
	int height;
	AVLNode left;
	AVLNode right;
	
	AVLNode()
	{
		left = null;
		right = null;
		data = 0;
		height = 0;
	}
	
	AVLNode(int n)
	{
		data = n;
	}
}

