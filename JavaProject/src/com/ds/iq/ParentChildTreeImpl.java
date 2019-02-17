package com.ds.iq;

import java.util.ArrayList;
import java.util.List;

public class ParentChildTreeImpl {

	public static void main(String[] args) {
		String input = "Elemental#Nitrogen,Entry#Substance,Substance#Elemental,Substance#Compound,"
				+ "Compound#Phosphate,Compound#Pigments,Substance#Unclassified,Pigments#Chlorophyll";
		
		String[] tupples = input.split(",");
		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < tupples.length; i++) {
			String[] parentchild = tupples[i].split("#");
			Node parent = new Node(parentchild[0]);
			Node child = new Node(parentchild[1]);
			if (!nodes.contains(parent)) {
				nodes.add(parent);
			}

			Node existNode = nodes.get(nodes.indexOf(parent));
			int childIndex = nodes.indexOf(child);
			if (-1 == childIndex) {
				existNode.children.add(child);
				nodes.add(child);
			} else {
				Node existsChild = nodes.get(childIndex);
				existNode.children.add(existsChild);
			}

		}
		System.out.println(nodes);

		// find root node
		Node root = null;
		for (Node node : nodes) {
			boolean isRoot = true;
			for (Node eachNode : nodes) {
				if (eachNode.children.contains(node)) {
					isRoot = false;
					break;
				}
			}
			if (isRoot) {
				root = node;
				break;
			}
		}
		System.out.println("Whole tree:" + root);
		System.out.println("root node:" + root.value);

		// find the longest path and shortest path
		// String maxpath = root.value + "-->";
		// String minpath = root.value + "-->";
		// int len = 1;
		// Stack<Node> stack = new Stack<>();
		// stack.add(root);
		// while (!stack.isEmpty()) {
		// Node thisNode = stack.pop();
		// if (thisNode.children.isEmpty()) {
		//
		// } else {
		// thisNode.children.stream().forEach(node -> stack.push(node));
		// }
		// }
	}
}

class Node {
	String value;
	List<Node> children = new ArrayList<>();

	Node(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value + ":" + children;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
}
