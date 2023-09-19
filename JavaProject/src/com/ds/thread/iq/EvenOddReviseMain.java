package com.ds.thread.iq;

public class EvenOddReviseMain {

	public static void main(String[] args) {
		
		EvenOddRevise even = new EvenOddRevise(0);
		EvenOddRevise odd = new EvenOddRevise(1);
		
		new Thread(even).start();
		new Thread(odd).start();
		
	}
}
