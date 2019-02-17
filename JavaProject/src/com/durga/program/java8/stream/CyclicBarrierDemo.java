package com.durga.program.java8.stream;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		
		Runnable barrier1Action = new Runnable() {
		    public void run() {
		        System.out.println("BarrierAction 1 executed ");
		    }
		};
		Runnable barrier2Action = new Runnable() {
		    public void run() {
		        System.out.println("BarrierAction 2 executed ");
		    }
		};

		CyclicBarrier barrier1 = new CyclicBarrier(2, barrier1Action);//task-1
		CyclicBarrier barrier2 = new CyclicBarrier(2, barrier2Action);//task-2

		CyclicBarrierRunnable barrierRunnable1 =
		        new CyclicBarrierRunnable(barrier1, barrier2);

		CyclicBarrierRunnable barrierRunnable2 =
		        new CyclicBarrierRunnable(barrier1, barrier2);

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(barrierRunnable1);
		service.execute(barrierRunnable2);
	
		service.shutdown();
	}
}

class CyclicBarrierRunnable implements Runnable{

    CyclicBarrier barrier1 = null;
    CyclicBarrier barrier2 = null;

    public CyclicBarrierRunnable(
            CyclicBarrier barrier1,
            CyclicBarrier barrier2) {

        this.barrier1 = barrier1;
        this.barrier2 = barrier2;
    }

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                                " waiting at barrier 1");
            this.barrier1.await();

            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                                " waiting at barrier 2");
            this.barrier2.await();

            System.out.println(Thread.currentThread().getName() +
                                " done!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}