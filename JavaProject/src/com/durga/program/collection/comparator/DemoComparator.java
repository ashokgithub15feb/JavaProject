package com.durga.program.collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class DemoComparator {

		public static void main(String[] args) {
			
			TreeSet t = new TreeSet(new MyComparator2Demo());
			t.add(new StringBuffer("A"));
			t.add(new StringBuffer("Z"));
			t.add(new StringBuffer("K"));
			t.add(new StringBuffer("L"));
			t.add(new StringBuffer("L"));
			System.out.println(t);
			
		}
	}

	class MyComparator2Demo implements Comparator
	{
		@Override
		public int compare(Object o1, Object o2) {

			String s1 = o1.toString();
			String s2 = o2.toString();
			
			return s2.compareTo(s1);
		}
	}
