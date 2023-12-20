package com.datastructures.tree;

public class BSTNode {

	int data;
	BSTNode left;
	BSTNode right;
	
	public BSTNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}

	@Override
	public String toString() {
		return "BSTNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
	
}
