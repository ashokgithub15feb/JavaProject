package com.program.coding.round.sg2019.pcproblem;

public class MainThread {

	private static int i = 0;
	public static void main(String[] args) {
		
		Common common = new Common();
		
		Runnable producer = () -> {

			while(true)
			{
				i++;
				common.producer(i);
			}
		};
		
		Runnable consumer = () -> {
			
			while(true)
			{
				int consumerItem = common.consumer();
				System.out.println("Consumer consume : "+consumerItem);
			}
		};
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		
		t1.start();
		t2.start();
		
	}
}
