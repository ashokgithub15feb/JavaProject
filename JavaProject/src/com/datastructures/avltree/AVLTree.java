package com.datastructures.avltree;

class AVLTNode {
	
	int data;
	AVLTNode left;
	AVLTNode right;
	int height;
	
	public AVLTNode(int data) {
		this.data = data;
		this.height = 1;
	}

	@Override
	public String toString() {
		return "AVLTNode [data=" + data + ", left=" + left + ", right=" + right + ", height=" + height + "]";
	}
	
	
}

public class AVLTree {

	AVLTNode root;
	
	public void insert(int key) {
		
		root = insert(root, key);
	}

	private AVLTNode insert(AVLTNode p, int key) {
		
		if (p == null) {
			p = new AVLTNode(key);
		}

		if (key < p.data) {
			p.left = insert(p.left, key);
		} else if(key > p.data){
			p.right = insert(p.right, key);
		}
		
		p.height = nodeHeight(p);
		
		if(balancedFactor(p) == 2 && balancedFactor(p.left) == 1) {
			System.out.println("LL - Rotaton applied");
			return LLRotaton(p);
		}
		else if(balancedFactor(p) == 2 && balancedFactor(p.left) == -1){
			System.out.println("LR - Rotaton applied");
			return LRRotation(p);
		}
		else if(balancedFactor(p) == -2 && balancedFactor(p.right) == -1){
			System.out.println("RR - Rotaton applied");
			return RRRotaton(p);
		}
		else if(balancedFactor(p) == -2 && balancedFactor(p.right) == 1){
			System.out.println("RL - Rotaton applied");
			return RLRotaton(p);
		}
		
		return p;
	}

	private AVLTNode RLRotaton(AVLTNode p) {
		
		AVLTNode pr = p.right;
		AVLTNode prl = pr.left;
		
		pr.left = prl.right;
		p.right = prl.left;
		
		prl.left = p;
		prl.right = pr;
		
		p.height = nodeHeight(p);
		pr.height = nodeHeight(pr);
		prl.height = nodeHeight(prl);
		
		if(root == p) {
			root = prl;
		}
		return prl;
	}

	private AVLTNode RRRotaton(AVLTNode p) {
		
		AVLTNode pr = p.right;
		AVLTNode prl = pr.left;
		
		pr.left = p;
		p.right = prl;
		
		p.height = nodeHeight(p);
		pr.height = nodeHeight(pr);
		
		if(root == p) {
			root = pr;
		}
		
		return pr;
	}

	private AVLTNode LRRotation(AVLTNode p) {
		
		AVLTNode pl = p.left;
		AVLTNode plr = pl.right;
		
		pl.right = plr.left;
		p.left = plr.right;
		
		plr.left = pl;
		plr.right = p;
		
		p.height = nodeHeight(p);
		pl.height = nodeHeight(pl);
		plr.height = nodeHeight(plr);
		
		if(root == p) {
			root = plr;
		}
		
		return plr;
	}

	private AVLTNode LLRotaton(AVLTNode p) {
		
		AVLTNode pl = p.left;
		AVLTNode plr = pl.right;
		
		pl.right = p; // root
		p.left = plr;
		p.height = nodeHeight(p);
		pl.height = nodeHeight(pl);
		
		if(root == p) {
			root = pl;
		}
		return pl;
	}

	private int nodeHeight(AVLTNode p) {
		
		int hl = 0;
		int hr = 0;
		
		hl = (p != null && p.left != null) ? p.left.height : 0;
		hr = (p != null && p.right != null) ? p.right.height : 0;
		
		return hl > hr ? (hl + 1)  : (hr + 1);
	}
	
	private int balancedFactor(AVLTNode p) {
		int hl = 0;
		int hr = 0;
		
		hl = (p != null && p.left != null) ? p.left.height : 0;
		hr = (p != null && p.right != null) ? p.right.height : 0;
		
		return hl - hr;
	}
	
	private void inorder() {
		System.out.println("In Order");
		inorder(root);
	}
	
	private void inorder(AVLTNode p) {
		
		if(p != null) {
			inorder(p.left);
			System.out.print(p.data+"->");
			inorder(p.right);
		}
	}
	
	private void preorder() {
		System.out.println("Pre Order");
		preorder(root);
	}
	
	private void preorder(AVLTNode p) {
		
		if(p != null) {
			System.out.print(p.data+"->");
			preorder(p.left);
			preorder(p.right);
		}
	}
	
	private void postorder() {
		System.out.println("Post Order");
		postorder(root);
	}
	
	private void postorder (AVLTNode p) {
		
		if(p != null) {
			inorder(p.left);
			inorder(p.right);
			System.out.print(p.data+"->");
		}
	}

	public static void main(String[] args) {
		
		AVLTree avlt = new AVLTree();
		//LL - Rotation
		//avlt.insert(10);
		//avlt.insert(5);
		//avlt.insert(2);
		//System.out.println(avlt.root);
		
		//LR - Rotation
		//avlt.insert(50);
		//avlt.insert(10);
		//avlt.insert(20);
		//System.out.println(avlt.root);
		
		//RR - Rotation
		//avlt.insert(10);
		//avlt.insert(20);
		//avlt.insert(30);
		//System.out.println(avlt.root);
		
		//RL - Rotation
		//avlt.insert(20);
		//avlt.insert(50);
		//avlt.insert(30);
		
		//avlt.inorder();
	//	System.out.println(avlt.root);
			
		avlt.insert(10);
		avlt.insert(20);
		avlt.insert(30);
		avlt.insert(25);
		avlt.insert(28);
		avlt.insert(27);
		avlt.insert(5);
		avlt.inorder();
		System.out.println();
		avlt.preorder();
		System.out.println();
		avlt.postorder();
		System.out.println();
		System.out.println("Main method - end");
	}
}
