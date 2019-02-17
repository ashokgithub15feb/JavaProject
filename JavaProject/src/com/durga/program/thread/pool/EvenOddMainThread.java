package com.durga.program.thread.pool;

import java.math.BigInteger;

public class EvenOddMainThread {

	static BigInteger myBigInt = new BigInteger("123_456_999");;
	
	public static void main(String[] args) {
		System.out.println(String.valueOf(myBigInt));
		int number = 10;
		
		EvenThread even = new EvenThread(number);
		
		Thread t1 = new Thread(even);
		t1.start();
	}
}
