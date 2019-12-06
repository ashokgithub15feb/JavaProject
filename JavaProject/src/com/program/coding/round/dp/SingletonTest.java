package com.program.coding.round.dp;

public class SingletonTest {

	public static void main(String[] args) {
		
		Singleton instance = Singleton.getInstance();
		Singleton instance1 = Singleton.getInstance();
		
		System.out.println(instance);
		System.out.println(instance1);
		
		System.out.println(instance == instance1);
	}
}
