package com.durga.program.racecondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaskClass1 implements Runnable

{

	private Condition condition;

	private Lock lock;

	boolean exit = false;

	int i;

	TaskClass1(Condition condition, Lock lock)

	{

		this.condition = condition;

		this.lock = lock;

	}

	@Override

	public void run() {

		try

		{

			lock.lock();

			for (i = 1; i < 11; i++)

			{

				if (i % 2 == 0)

				{

					condition.signal();

					condition.await();

				}

				if (i % 2 != 0)

				{

					System.out.println(Thread.currentThread().getName() + " == " + i);

				}

			}

		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} finally

		{

			lock.unlock();

		}

	}

	class TaskClass2 implements Runnable

	{

		private Condition condition;

		private Lock lock;

		boolean exit = false;

		TaskClass2(Condition condition, Lock lock)

		{

			this.condition = condition;

			this.lock = lock;

		}

		@Override

		public void run() {

			int i;

			// TODO Auto-generated method stub

			try

			{

				lock.lock();

				for (i = 2; i < 11; i++)

				{

					if (i % 2 != 0)

					{

						condition.signal();

						condition.await();

					}

					if (i % 2 == 0)

					{

						System.out.println(Thread.currentThread().getName() + " == " + i);

					}

				}

			} catch (InterruptedException e) {

				// TODO Auto-generated catch block

				e.printStackTrace();

			} finally

			{

				lock.unlock();

			}

		}

	}
	
	public static void main(String[] a)

	{

	Lock lock = new ReentrantLock();

	Condition condition = lock.newCondition();

	Future future1;

	Future future2;

	ExecutorService executorService = Executors.newFixedThreadPool(2);

	future1 = executorService.submit(new TaskClass1(condition,lock));

//	future2 = executorService.submit(new TaskClass2(condition,lock));

	executorService.shutdown();

	}
}

