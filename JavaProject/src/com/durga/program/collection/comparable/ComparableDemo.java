package com.durga.program.collection.comparable;

public class ComparableDemo {

	public static void main(String[] args) {
		
		System.out.println("A".compareTo("Z")); //-ve
		System.out.println("Z".compareTo("A")); // +ve
		System.out.println("A".compareTo("A")); // 0
		System.out.println("A".compareTo(null));
		
	}
}
