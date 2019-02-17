package com.durga.program.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> h = new HashSet<>();


		for(int i=0 ; i< 10 ; i++)
		{
			h.add(i + 5);
		}
		
		h.add(500);
		h.add(600);
		h.add(700);
		
		System.out.println(h);
		System.out.println(h.size());
	}
}
