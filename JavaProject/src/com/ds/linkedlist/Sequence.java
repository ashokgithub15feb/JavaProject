package com.ds.linkedlist;

public class Sequence {

	public static void main(String[] args) {
		
		maxCycleSizeBetween(1, 10);
	}
	
	static int cycleSize(int x) {
	    int cycle = 1;

	    while (x != 1) {
	        if (x % 2 == 0) { //if even
	            x = x / 2;
	        } else { //if odd
	            x = x * 3 + 1;
	        }
	        ++cycle;
	    }
	    System.out.println(cycle);
	    return cycle;
	}
	
	static int maxCycleSizeBetween(int a, int b) {
	    if (a > b) { //if b > a, swap them
	        int temp = a;
	        a = b;
	        b = temp;
	    }
	    int maxCycle = 0;
	    
	    for (; a <= b; a++) {
	        int thisCycleSize = cycleSize(a);
	        if (thisCycleSize > maxCycle) {
	            maxCycle = thisCycleSize;
	        }
	    }
	    return maxCycle;
	}
}

