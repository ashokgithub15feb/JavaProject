package com.durga.program.thread;

public class PriorityDemo {

	public static void main(String[] args) {
		
		P1Thread pt1 = new P1Thread();
		P2Thread pt2 = new P2Thread();
		P3Thread pt3 = new P3Thread();
		
		Thread t1 = new Thread(pt1);
		Thread t2 = new Thread(pt2);
		Thread t3 = new Thread(pt3);
		
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(3);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Mian-Thread:"+i);
		}
	}
}
