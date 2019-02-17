package com.durga.program.thread;

public class SynchronizationBlockDemo232 {

	public static void main(String[] args) {
		
		DisplayBlock d1 = new DisplayBlock();
		DisplayBlock d2 = new DisplayBlock();
		
		SynchThreadBlock t1 = new SynchThreadBlock(d1 , "Ashok");
		SynchThreadBlock t2 = new SynchThreadBlock(d1 , "Dhoni");
		
		t1.start();
		t2.start();
	}
}
