package com.durga.program.thread;

public class SynchThreadBlock extends Thread{

	DisplayBlock d;
	String name;
	
	public SynchThreadBlock(DisplayBlock d, String name) {
		this.d = d;
		this.name= name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
}
