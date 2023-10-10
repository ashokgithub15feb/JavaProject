package com.datastructures.recursion;

public class Quiz5 {

	static int d = 1;
	
	public static void main(String[] args) {
		
		int n = 3;
		count(n);
	}

	private static void count(int n) {
		System.out.print(n+" ");
		System.out.print(d+" ");
		d++;
		if(n > 1) {
			count(n - 1);
		}
		System.out.print(d+" ");
	}
}
