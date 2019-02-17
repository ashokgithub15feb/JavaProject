package com.durga.program.map;

public class Thread1 {

	static int i = 10;
	static int j = 20;

	public static void m() {
		System.out.println(i);
		System.out.println(j);

		synchronized (Thread1.class) {
			i++;
			j++;

			System.out.println("in synchronized block: " + i);
			System.out.println("in synchronized block: " + j);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("completed - m() method");
	}

	public static void main(String[] args) {

		Thread1 t = new Thread1();

		Thread tt = new Thread() {

			@Override
			public void run() {

				m();
			}
		};

		Thread tt1 = new Thread() {

			@Override
			public void run() {

				m();
			}
		};

		Thread tt2 = new Thread() {

			@Override
			public void run() {

				m();
			}
		};

		Thread tt3 = new Thread() {

			@Override
			public void run() {

				m();
			}
		};

		tt.start();
		tt1.start();
		tt2.start();
		tt3.start();

		Runnable r = new Thread();
		r.run();
		
		Thread r1 = new Thread();
		r1.run();
		r1.stop();
		r1.isAlive();
		
		System.out.println("main-End");
		
		
	}
}
