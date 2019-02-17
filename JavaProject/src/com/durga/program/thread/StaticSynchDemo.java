package com.durga.program.thread;

public class StaticSynchDemo {

	public static void main(String[] args) {
		
		SynchClass synchClass = new SynchClass();
		
		MyThreadDemo1 t1 = new MyThreadDemo1(synchClass);
		MyThreadDemo2 t2 = new MyThreadDemo2(synchClass);
		MyThreadDemo3 t3 = new MyThreadDemo3(synchClass);
		MyThreadDemo4 t4 = new MyThreadDemo4(synchClass);
		MyThreadDemo5 t5 = new MyThreadDemo5(synchClass);
		MyThreadDemo6 t6 = new MyThreadDemo6(synchClass);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		
	}
}

class MyThreadDemo1 extends Thread
{
	SynchClass s1;

	public MyThreadDemo1(SynchClass s1) {
		this.s1 = s1;
	}
	
	@Override
	public void run() {
		s1.m1();
	}
}

class MyThreadDemo2 extends Thread
{
	SynchClass s1;

	public MyThreadDemo2(SynchClass s1) {
		this.s1 = s1;
	}
	
	@Override
	public void run() {
		s1.m1();
	}
}

class MyThreadDemo3 extends Thread
{
	SynchClass s1;

	public MyThreadDemo3(SynchClass s1) {
		this.s1 = s1;
	}
	
	@Override
	public void run() {
		s1.m2();
	}
}

class MyThreadDemo4 extends Thread
{
	SynchClass s1;

	public MyThreadDemo4(SynchClass s1) {
		this.s1 = s1;
	}
	
	@Override
	public void run() {
		s1.m3();
	}
}

class MyThreadDemo5 extends Thread
{
	SynchClass s1;

	public MyThreadDemo5(SynchClass s1) {
		this.s1 = s1;
	}
	
	@Override
	public void run() {
		s1.m4();
	}
}

class MyThreadDemo6 extends Thread
{
	SynchClass s1;

	public MyThreadDemo6(SynchClass s1) {
		this.s1 = s1;
	}
	
	@Override
	public void run() {
		s1.m5();
	}
}

class SynchClass
{
	public static synchronized void m1()
	{
		try
		{
			for(int i=0; i<10; i++)
			{
				System.out.println("static synchronized void m1()");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e)
		{
			System.err.println("Interrupted Exception: in m1() "+e.getMessage());
		}
	}
	
	public static synchronized void m2()
	{
		try
		{
			for(int i=0; i<10; i++)
			{
				System.out.println("static synchronized void m2()");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e)
		{
			System.err.println("Interrupted Exception: in m2() "+e.getMessage());
		}
	}
	
	public static void m3()
	{
		try
		{
			for(int i=0; i<10; i++)
			{
				System.out.println("static void m3()");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e)
		{
			System.err.println("Interrupted Exception: in m3() "+e.getMessage());
		}
	}
	
	public synchronized void m4()
	{
		try
		{
			for(int i=0; i<10; i++)
			{
				System.out.println("synchronized void m4()");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e)
		{
			System.err.println("Interrupted Exception: in m4() "+e.getMessage());
		}
	}
	
	public void m5()
	{
		try
		{
			for(int i=0; i<10; i++)
			{
				System.out.println("void m5()");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e)
		{
			System.err.println("Interrupted Exception in m5(): "+e.getMessage());
		}
	}
}

/*  --- Output
static synchronized void m1()
synchronized void m4()
void m5()
static void m3()


void m5()
static void m3()
synchronized void m4()
static synchronized void m1()



static void m3()
synchronized void m4()
void m5()
static synchronized void m1()



static void m3()
synchronized void m4()
void m5()
static synchronized void m1()


synchronized void m4()
static void m3()
static synchronized void m1()
void m5()


synchronized void m4()
static void m3()
static synchronized void m1()
void m5()


static void m3()
synchronized void m4()
static synchronized void m1()
void m5()


static void m3()
synchronized void m4()
static synchronized void m1()
void m5()


static void m3()
synchronized void m4()
void m5()
static synchronized void m1()

static void m3()
synchronized void m4()
void m5()
static synchronized void m1()


static synchronized void m1()
static synchronized void m1()
static synchronized void m1()
static synchronized void m1()
static synchronized void m1()
static synchronized void m1()
static synchronized void m1()
static synchronized void m1()
static synchronized void m1()
static synchronized void m1()
static synchronized void m2()


static synchronized void m2()
static synchronized void m2()
static synchronized void m2()
static synchronized void m2()
static synchronized void m2()
static synchronized void m2()
static synchronized void m2()
static synchronized void m2()
static synchronized void m2()

*/