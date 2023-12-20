package com.datastructures.array;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		boolean remove = set.remove("Ashok");
		
		boolean add = set.add("Ashok");
		
		boolean add1 = set.add("Ashok");
		
		System.out.println(remove+" : "+add+" "+add1);
		
	}
}
