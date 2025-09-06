package com.interviews.java8.programs;

class A {

    public synchronized  void d1(B b) throws InterruptedException {
        System.out.println("Thread 1 has aquired lock on A object");
        Thread.sleep(500);
        System.out.println("Thread 1 waiting for  lock on B object");
        b.last();
    }

    public synchronized void last(){
        System.out.println("a last");

    }
}

class B {

    public synchronized  void d1(A a) throws InterruptedException {
        System.out.println("Thread 2 has aquired lock on B object");
        Thread.sleep(500);
        System.out.println("Thread 2 waiting  lock on A object");
        a.last();
    }

    public synchronized void last(){
        System.out.println("b last");

    }

}

public class Test {

	public static void main(String[] args) {
		
		A a = new  A();
        B b = new B();
        
        Thread t1 = new Thread(()->{
            try {
                a.d1(b);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(()->{
            try {
                b.d1(a);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
	}
}
