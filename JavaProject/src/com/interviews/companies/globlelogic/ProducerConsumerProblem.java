package com.interviews.companies.globlelogic;

/*
 * 2. Producer-Consumer Problem with wait() and notify()
One thread produces data while another consumes it, requiring coordination.
wait() and notify() control synchronization between producer and consumer.


 */
class Drop {
	private String message;
	private boolean empty = true;

	public synchronized String take() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

		empty = true;
		notifyAll();
		return message;
	}

	public synchronized void put(String message) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		empty = false;
		this.message = message;
		notifyAll();

	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		Drop drop = new Drop();

		Runnable producer = () -> {
			String[] messages = { "Message 1", "Message 2", "DONE" };

			for (String message : messages) {
				System.out.println("Produced: " + message);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		};

		Runnable consumer = () -> {

			for (String message = drop.take(); !message.equals("DONE"); message = drop.take()) {
				System.out.println("Consumed: " + message);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		};

		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		
		t1.start();
		t2.start();
		
	}
}
