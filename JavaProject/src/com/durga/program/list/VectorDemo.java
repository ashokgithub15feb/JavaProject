package com.durga.program.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(30);
		v.add(100);
		v.add(80);
		
		System.out.println(v);
		
		v.addElement(50);
		v.addElement(510);
		v.addElement(520);
		
		System.out.println(v);
		
		
		Enumeration<Integer> elements = v.elements();
		
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
			v.remove(2);
			v.add(600);
			v.removeElement(600);
			
			v.add(3, 887);
		}
	}
}
