package com.program.coding.round.threadpool;

public class TestTask implements Runnable {

	private int number;
    public TestTask(int number) {
        this.number = number;
    }
   @Override
    public void run() {
        System.out.println("Start executing of task number :"+ number);
        try {
            //Simulating processing time
        	//perform tasks
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End executing of task number :"+ number);
    }
}
