package com.durga.program.java8;

public class DefaultMethod {

	public static void main(String[] args) {
		
		C1 c = new C1();
		c.m6();
	}
}

interface I1
{
	public void m1();
	public void m2();
	public void m3();
	public void m4();
	public void m5();
	//public void m6(); can not add ant method in interface 
	default void m6() //default method can be add
	{
		System.out.println("Default method");
	}
	
	/*default int hashCode() //CTE
	{
		return 10;
	}*/
	
}

class C1 implements I1
{

	@Override
	public void m6() {

		System.out.println("Overriding version of default m6() method");
	
	}
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}
	
}


class C2 implements I1
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}
	
}