package com.ds.tree;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		
		BinaryTreeImpl bt = new BinaryTreeImpl();
			
		bt.insert(1);
		bt.insert(2);
		bt.insert(3);
		bt.insert(4);
		bt.insert(5);
		bt.insert(6);
		bt.insert(7);
		bt.insert(8);
		
		bt.inOrder();
	}
}

class BinaryTreeImpl
{
	BTNode root;
	
	public BinaryTreeImpl() {

		root = null;
	}
	
	public void insert(int data)
	{
		root = insert(root, data);
	}

	private BTNode insert(BTNode node, int data)
	{
		if(node == null)
		{
			node = new BTNode(data);
		}
		else
		{
			if(node.right == null)
			{
				node.right = insert(node.right, data);
			}
			else
			{
				node.left = insert(node.left, data);
			}
		}
		return node;
	}
	
	public int countNode()
	{
		return countNode(root);
	}
	
	public int countNode(BTNode root)
	{
		int count = 1;

		if(root == null)
		{
			return 0;
		}
		else
		{
			
			count = count + countNode(root.left);
			count = count + countNode(root.right);
		}
		
		return count;
	}
	
	public void inOrder()
	{
		inOrder(root);
	}
	
	public void inOrder(BTNode root)
	{
		if(root != null)
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
}

class BTNode
{
	BTNode left;
	BTNode right;
	int data;
	
	BTNode()
	{
		left = null;
		right = null;
		data = 0;
	}
	
	BTNode(int data)
	{
		left = null;
		right = null;
		this.data = data;
	}
}
