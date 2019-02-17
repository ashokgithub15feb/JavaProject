package com.durga.program.map;

import java.util.LinkedList;
import java.util.List;

public class MultipleReadAndOneWrite {

	public static void main(String[] args) {

	}
}

class Thread111 implements Runnable {
	
	List<Integer> list = new LinkedList<>();
	
	@Override
	public void run() {

		boolean flag = false;
		m1(flag);

	}

	private void m1(boolean flag) {
		if (flag) {
			
			System.out.println(list.get(0));
		}
		else if(flag)
		{
			System.out.println(list.add(10));
		}
	}
}