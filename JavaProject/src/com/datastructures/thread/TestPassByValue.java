package com.datastructures.thread;

import java.util.Arrays;

public class TestPassByValue {

	public static void main(String[] args) {
		
		int x = 10;
		System.out.println(x);
		
		passByValue(x);
		System.out.println(x);
		
		int[] a = {10, 20};
		System.out.println(Arrays.toString(a));
		passByRefrence(a);
		System.out.println(Arrays.toString(a));
	}

	private static void passByRefrence(int[] a) {
		a[0] = 50;
	}

	private static void passByValue(int x) {
		x = x + 10;
	}
}
