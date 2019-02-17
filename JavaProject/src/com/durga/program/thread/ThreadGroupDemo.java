package com.durga.program.thread;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup g1 = new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName());
		ThreadGroup g2 = new ThreadGroup(g1, "Second Group");
		System.out.println(g2.getParent().getName());

		System.out.println("=========================");
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		
		system.enumerate(t);
		
		for(Thread t1 : t)
		{
			System.out.println(t1.getName()+ " ------------ "+t1.isDaemon());
		}
		
	}
}
