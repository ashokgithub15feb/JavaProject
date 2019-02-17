package com.durga.program.oops;

public class InstanceBlock {

	int i = 10;
	
	{
		m1();
		System.out.println("first instance block");
	}
	
	InstanceBlock()
	{
		System.out.println("Contractor");
	}
	
	public static void main(String[] args) {
		InstanceBlock oInstanceBlock = new InstanceBlock();
		System.out.println(oInstanceBlock.j);
		System.out.println("main");
		System.out.println("======================");
		InstanceBlock oInstanceBlock2 = new InstanceBlock();
		
		System.out.println("main");
	}


	private void m1() {
		System.out.println(j);
	}
	
	{
		System.out.println(i);
		System.out.println("second instance block");
		//System.out.println(j); // CTE - Cannot reference a field before it is defined
	}
	
	int j = 20;
}
