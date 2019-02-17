package com.ds.iq;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public final class StringImmutableClass {

	private int a;
	private final int f;
	
	public StringImmutableClass() {
	
		f = 10;
		a = 10;
	}

	public int getA()
	{
		return a;
	}
	
	public int getF()
	{
		return f;
	}
	
	
	public static void main(String[] args) {
		
		String str = "ab";
		System.out.println(str);
		String concat = str.concat("cd");
		System.out.println(str);
		System.out.println(concat);
		System.out.println();
		
		StringBuffer sb = new StringBuffer("ab");
		System.out.println(sb);
		sb.append("cd");
		System.out.println(sb);
		
		StringImmutableClass s = new StringImmutableClass();
		s.m1();
		
		System.out.println();
		
		LinkedList<String> l = new LinkedList<>();
		l.add("AAA");
		l.add("A3A");
		l.add("A6A");
		System.out.println(l);
		System.out.println(l.get(2));
//		System.out.println(l.get(3));
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("AAA");
		l1.add("A3A");
		l1.add("A6A");
		System.out.println(l1);
		System.out.println(l1.get(2));
		System.out.println(l1.get(1));
		
		Vector<String> v = new Vector<>();
		v.add("A");
		v.add("A");
		v.add("A");
		v.add("A");
		
		System.out.println("");
		
		Enumeration<String> elements = v.elements();
		
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
			
			if(v.get(1).equals("A"))
			{
				v.add(1, "Assss");
				continue;
			}
		}
		
		
	}
	
	public final void m1()
	{
		System.out.println("Final method - m1");
	}
}
