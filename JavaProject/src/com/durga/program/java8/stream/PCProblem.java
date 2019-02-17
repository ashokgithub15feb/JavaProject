package com.durga.program.java8.stream;

public class PCProblem {

	private static Integer I1;

	public PCProblem(Integer I1) {
		PCProblem.I1 = I1;
	}

	public static void main(String[] args) {

		PCProblem.I1 = 10;
		
		Runnable r1 = () -> {

			synchronized (PCProblem.I1) {

				for(int i=0; i<I1; i++)
				{
					if (i % 2 == 0) {
						System.out.println("Even Number: " + i);
						try {
							I1.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						I1.notify();
					}
				}
				
			}
		};

		Runnable r2 = () -> {

			synchronized (PCProblem.I1) {
				
				for(int i=0; i<I1; i++)
				{
					if (i % 2 == 1) {
						System.out.println("Odd Number: " + i);
						try {
							I1.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					I1.notify();
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
