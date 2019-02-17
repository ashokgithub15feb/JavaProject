package com.durga.program.thread.pool;

public class DeadlockCreation {

	static DeadlockCreation oDeadlockCreation = new DeadlockCreation();
	
	static Integer u = new Integer(10);
	
	public static void m1()
	{
		synchronized(u) {
			
		}
		
		synchronized(DeadlockCreation.class) {
			
		}
	}
	
	
	public static void main(String[] args) {
        Thread thread1 = new Thread(new A(), "Thread-1-Class-A ");
 
        Thread thread2 = new Thread(new B(), "Thread-2-Class-B ");
        
        thread1.start();
        
        thread2.start();
 }
}

class A implements Runnable{
	DeadlockCreation oDeadlockCreation= new DeadlockCreation();
	
    public void run() {
           
           synchronized (oDeadlockCreation) {
                  
                  /*
                   * Adding this optional delay so that Thread-2 could enough time
                   * to lock Object class and form deadlock.
                   * If you remove this sleep, because of threads unpredictable
                   * behavior it might that Thread-1
                   * gets completed even before Thread-2 is started and we will
                   * never form deadLock.
                   */
                  try {
                        Thread.sleep(100);
                  } catch (InterruptedException e) {e.printStackTrace();}
                  
                  System.out.println(Thread.currentThread().getName() + "has acquired lock "
                            + "on String class and waiting to acquire lock on Object class...");
        
                  synchronized (oDeadlockCreation) {
                        System.out.println(Thread.currentThread().getName() +
                                      " has acquired lock on Object class");
                  }
           }
           
           System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
 
class B extends Thread{
	DeadlockCreation oDeadlockCreation= new DeadlockCreation();
    public void run() {
           
           synchronized (oDeadlockCreation) {  
                  System.out.println(Thread.currentThread().getName() + " has acquired "
                      + "lock on Object class and waiting to acquire lock on String class...");
                  
                  /*
                   * Adding this optional delay so that Thread-1 could enough
                   * time to lock String class and form deadlock.
                   * If you remove this sleep, because of threads unpredictable
                   * behavior it might that Thread-2
                   * gets completed even before Thread-1 is started and we
                   * will never form deadLock.
                   */
                  try {
                        Thread.sleep(100);
                  } catch (InterruptedException e) {e.printStackTrace();}
                  
                  
                  synchronized (oDeadlockCreation) {
                        System.out.println(Thread.currentThread().getName() +
                                      " has acquired lock on String class");
                  }
           }
           
           System.out.println(Thread.currentThread().getName()+ " has ENDED");
    }
}
