package com.ds.thread;

public class OddThread implements Runnable {
	private volatile Integer n;
	private Object object;

	public OddThread(Integer n, Object object) {
		this.n = n;
		this.object = object;

	}

	@Override
	public void run() {

		for (int i = 1; i < n; i+=2) {
			try {
				synchronized (object) {
					if (i % 2 != 0) {
						System.out.println(i);
						object.notify();
					}
					object.wait();
				}
			} catch (Exception e) {

			}
		}
	}
}
