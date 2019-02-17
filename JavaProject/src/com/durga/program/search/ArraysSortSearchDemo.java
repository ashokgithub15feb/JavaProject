package com.durga.program.search;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysSortSearchDemo {

	enum r

	{
		
		r()
		{
			
		}
		
		
	}
	public static void main(String[] args) {
		int[] l = {10, 5, 20, 11, 6};
		System.out.println(l);
		
		System.out.println(true & false);
		System.out.println(true | false);
		System.out.println(true ^ false);
		
		System.out.println(4 & 5); 
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);
		
		Arrays.binarySearch(l, 10);
		System.out.println("JVM Bit size: " + System.getProperty("sun.arch.data.model"));
		System.out.println("JVM Bit size: " + System.getProperty("os.arch"));
	}
}
