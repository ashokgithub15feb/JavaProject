package com.ds.tree;

public class BSTImpl {

	public static void main(String[] args) {
		
		BST bst = new BST();
		
		bst.insert(15);
		bst.insert(10);
		bst.insert(8);
		bst.insert(12);
		bst.insert(20);
		bst.insert(17);
		bst.insert(25);
		
		System.out.println("In Order: LDR: ");
		bst.inOrder();
		System.out.println("\nIn Order: DLR: ");
		bst.preOrder();
		System.out.println("\nIn Order: LRD: ");
		bst.postOrder();
		System.out.println("\nDec Order: RDL: ");
		bst.decOrder();
		System.out.println();
		int searchData = 16;
		
		boolean search = bst.search(searchData);
		
		if(search)
		{
			System.out.println("Searched Item Present in BST: "+search+" : "+searchData);
		}
		else
		{
			System.out.println("Searched Item not Present in BST: "+search+" : "+searchData);
		}
		
		bst.delete(10);
		
		System.out.println();
		bst.inOrder();
		System.out.println();
		System.out.println("Number of Node: "+bst.countNode());
	}
}

class BST
{
	BSTNode root;
	
	BST()
	{
		root = null;
	}
	
	public void insert(int data)
	{
		root = insert(root, data);
	}
	
	public BSTNode insert(BSTNode node, int data)
	{
		if(node == null)
		{
			node = new BSTNode(data);
		}
		else
		{
			if(data <= node.data)
			{
				node.left = insert(node.left, data);
			}
			else
			{
				node.right = insert(node.right, data);
			}
		}
		return node;
	}
	
	public boolean search(int sData)
	{
		return search(root, sData);
	}
	
	public boolean search(BSTNode node, int sData)
	{
		boolean found = false;
		
		while(node != null && !found)
		{
			if(sData < node.data)
			{
				node = node.left;
			}
			else if(sData > node.data)
			{
				node = node.right;
			}
			else
			{
				found = true;
				break;
			}
			
			found = search(node, sData);
		}
		
		return found;
	}
	
	public BSTNode delete(int data)
	{
		return delete(root, data);
	}
	
	public BSTNode delete(BSTNode node, int data)
	{
		BSTNode p;
		BSTNode p2;
		
		BSTNode n;
		if(node.data == data)
		{
			BSTNode lt;
			BSTNode rt;
			
			lt = node.left;
			rt = node.right;
			
			if(lt == null && rt == null)
			{
				return null;
			}
			else if(lt == null)
			{
				p = rt;
				return p;
			}
			else if(rt == null)
			{
				p = lt;
				return p;
			}
			else
			{
				p2 = rt;
				p = rt;
				
				while(p.left != null)
				{
					p = p.left;
				}
				
				p.left = lt;
				return p2;
			}
		}
		
		if(data < node.data)
		{
			n = delete(node.left, data);
			node.left = n;
		}
		else
		{
			n = delete(node.right, data);
			node.right = n;
		}
		
		return node;
	}
	
	public int countNode()
	{
		return countNode(root);
	}
	
	
	public int countNode(BSTNode node)
	{
		int count = 1;
		
		if(node == null)
		{
			return 0;
		}
		else
		{
			count = count + countNode(node.left);
			count = count + countNode(node.right);
			
		}
		
		return count;
	}
	
	public void inOrder()
	{
		inOrder(root);
	}
	
	public void inOrder(BSTNode node)
	{
		if(node != null)
		{
			inOrder(node.left);
			System.out.print(node.data+" ");
			inOrder(node.right);
		}
	}
	
	public void decOrder()
	{
		decOrder(root);
	}
	
	public void decOrder(BSTNode node)
	{
		if(node != null)
		{
			decOrder(node.right);
			System.out.print(node.data+" ");
			decOrder(node.left);
		}
	}
	
	public void preOrder()
	{
		preOrder(root);
	}
	
	public void preOrder(BSTNode node)
	{
		if(node != null)
		{
			System.out.print(node.data+" ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	public void postOrder()
	{
		postOrder(root);
	}
	
	public void postOrder(BSTNode node)
	{
		if(node != null)
		{
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data+" ");
		}
	}
}


class BSTNode
{
	int data;
	BSTNode left;
	BSTNode right;
	
	BSTNode()
	{
		data = 0;
		left = null;
		right = null;
	}
	
	BSTNode(int n)
	{
		data = n;
		left = null;
		right = null;
	}
}
















interface I1
{
	void m1();
}

interface I2
{
	void m1();
}

interface I3 extends I1, I2
{
	void m1();
}

class C1 implements I3
{
	@Override
	public void m1() 
	{
		System.out.println("C1-m1()");
	}
}


