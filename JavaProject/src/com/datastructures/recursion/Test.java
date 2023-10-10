package com.datastructures.recursion;

import java.time.LocalDate;

public class Test extends Thread implements Runnable{

	@Override
	public void run() {
		System.out.println("TEST");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		
		int x, result;
		x = 1;
		result = 0;
		
		while(x <= 10) {
			
			if(x % 2 == 0)
				result = result + x;
			++x;
				
		}
		System.out.println(result);
		LocalDate.now().plusDays(5);
		
	}
}
