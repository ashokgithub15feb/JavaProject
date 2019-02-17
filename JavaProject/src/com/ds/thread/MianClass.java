package com.ds.thread;

public class MianClass{
	
	public static void main(String[] args) {
		
		Printer print = new Printer();
	    Thread t1 = new Thread(new TaskEvenOdd(print, 10, false),"Odd");
	    Thread t2 = new Thread(new TaskEvenOdd(print, 10, true),"Even");
	    t1.start();
	    t2.start();
	}
}

class TaskEvenOdd   implements Runnable {
	
    private int max;
    private Printer print;
    private boolean isEvenNumber;
    // standard constructors
 
    public TaskEvenOdd(Printer print2, int i, boolean b) {
    	
    	max = i;
    	print = print2;
    	isEvenNumber = b;
    }

	@Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }
    }	
}

class Printer {
    private volatile boolean isOdd;
 
    synchronized void printEven(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(number);
//        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = false;
        notify();
    }
 
    synchronized void printOdd(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(number);
//        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = true;
        notify();
    }
}