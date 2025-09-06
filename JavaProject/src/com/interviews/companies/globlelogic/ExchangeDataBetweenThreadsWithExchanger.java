package com.interviews.companies.globlelogic;

import java.util.concurrent.Exchanger;

//Allows two threads to swap data safely.



public class ExchangeDataBetweenThreadsWithExchanger {

    private static Exchanger<String> exchanger = new Exchanger<>();

    
	public static void main(String[] args) {
		Exchanger<Integer> exchangerInt = new Exchanger<>();
				
		Thread t1 = new Thread(() -> {
            try {
                String message = exchanger.exchange("Hello from T1");
                Integer a = exchangerInt.exchange(10);
                System.out.println("T1 received: " + message);
                System.out.println("T1 received: "+a);
            } catch (InterruptedException e) {}
        });
		
		Thread t2 = new Thread(() -> {
            try {
                String message = exchanger.exchange("Hello from T2");
                System.out.println("T2 received: " + message);
                Integer b = exchangerInt.exchange(20);
                System.out.println("T2 received: "+b);
            } catch (InterruptedException e) {}
        });
		
		t1.start();
        t2.start();
        
	}
}
