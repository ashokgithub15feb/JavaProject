package com.durga.program.interview;

public strictfp final  class Demo {

	public static void main(String[] args) {
		
		String s = "Ashok"; // i
		s.concat(" Yadav");
		System.out.println(s);
		
		String s1 = "Ashok";
		s1 = s1.concat(" Yadav");
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Durga");
		sb.append(" Kumar");
		System.out.println(sb);
		
		String ss = new String("Durga");
		String ss1 = new String("Durga");
		
		System.out.println(ss==ss1);
		System.out.println(ss.equals(ss1));
	}
}

abstract interface LLL
{
	
}