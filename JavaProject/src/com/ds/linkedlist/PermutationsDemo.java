package com.ds.linkedlist;

import java.util.ArrayList;

public class PermutationsDemo {

	public static ArrayList<String> permutations(String s) {
	    ArrayList<String> out = new ArrayList<String>();
	    if (s.length() == 1) {
	        out.add(s);
	        return out;
	    }
	    char first = s.charAt(0);
	    String rest = s.substring(1);
	    for (String permutation : permutations(rest)) {
	        out.addAll(insertAtAllPositions(first, permutation));
	    }
	    return out;
	}
	public static ArrayList<String> insertAtAllPositions(char ch, String s) {
	    ArrayList<String> out = new ArrayList<String>();
	    for (int i = 0; i <= s.length(); ++i) {
	        String inserted = s.substring(0, i) + ch + s.substring(i);
	        out.add(inserted);
	    }
	    return out;
	}
	
	public static void main(String[] args) {
		
		System.out.println(permutations("ABC"));
		
		
	}
}
