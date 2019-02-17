package com.durga.program.thread;

class JoinThreadDemo extends Thread
{
	@Override
	public void run() {
		
		try
		{
			for(int i=0; i<10; i++)
			{
				System.out.println("Seetha Thread");
				
				Thread.sleep(2000);
			}
		}catch (InterruptedException e) {
			System.out.println("Waiting Thread got Interrupted: "+e.getMessage());
		}
	}
}
public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(50000/ 15);
		// ---- one thread - main thread
		JoinThreadDemo t = new JoinThreadDemo();
		
		t.start();
		//---- two thread - main thread and JoinThreadDemo
		//main thread want to wait until completing JoinThreadDemo thread, the main thread has to entered into waiting stage,
		// until completing JoinThreadDemo thread.
		//t.join(); // if this line is commenting then both thread and main thread and child thread will execute simultaneously and we can't exact the output
		t.join(10000);
		for(int i=0; i<10;i++)
		{
			System.out.println("Rama Thread:");
			Thread.sleep(2000);
		}
	}
}
