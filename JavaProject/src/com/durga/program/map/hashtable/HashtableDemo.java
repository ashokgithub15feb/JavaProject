package com.durga.program.map.hashtable;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		h.put(new HashtableTemp(5), "A");
		h.put(new HashtableTemp(2), "B");
		h.put(new HashtableTemp(6), "C");
		h.put(new HashtableTemp(15), "D");
		h.put(new HashtableTemp(23), "E");
		h.put(new HashtableTemp(16), "F");
		
		System.out.println(h);
	}
}

class HashtableTemp
{
	int i ;
	
	public HashtableTemp(int i) {
		this.i = i;
	}
	
	@Override
	public int hashCode() {
		return i;//{6=C, 16=F, 5=A, 15=D, 2=B, 23=E}

		//return i % 9; //{16=F, 15=D, 6=C, 23=E, 5=A, 2=B}
	}
	
	@Override
	public String toString() {
		return i+"";
	}
}