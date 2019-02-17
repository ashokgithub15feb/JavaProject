package com.durga.program.java8;

public class TestLembdaExp {

	public static void main(String[] args) {
		
		//Interf oInterfImpl = new InterfImpl();
		
		Interf oInterfImpl = () -> System.out.println("Hello");
		
		oInterfImpl.m1();
		oInterfImpl.m1();
		oInterfImpl.m1();
		oInterfImpl.m1();
		
//		Addition d = (a, b) -> System.out.println(a+b);
//		d.add(10,20);
//		
//		Addition d2 = (int a, int b) -> System.out.println("The Sum of a and b: "+(a+b));
//		d2.add(10,20);
//		
		Addition d3 = (int a, int b, int c) -> System.out.println("The Sum of a and b: "+(a+b+c));
		d3.add2(10,20,30);
		
		IntrafSqur sq = n -> n * n;
		System.out.println("Squre of 5 is: "+sq.squreIt(5));
	}
}

interface Interf
{
	public void m1();
}

class InterfImpl implements Interf
{
	@Override
	public void m1() {

		System.out.println("Hello");
	}
}


interface Addition
{
	//public void add(int a, int b);
	
	public void add2(int a, int b, int c);
	
}

//using lambda exp not need this impl class
/*class AdditionImpl implements Addition
{
	@Override
	public void add(int a, int b) {

		System.out.println("The sum of a and b: "+a+b);
	}
}*/



interface IntrafSqur
{
	public int squreIt(int n);
}