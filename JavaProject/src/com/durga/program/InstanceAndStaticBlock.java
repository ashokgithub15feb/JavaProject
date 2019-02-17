package com.durga.program;

public class InstanceAndStaticBlock
{
	{
		System.out.println("FIB");
	}
	
	static
	{
		System.out.println("FSB");
	}
	
	InstanceAndStaticBlock()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {

		InstanceAndStaticBlock oInstanceAndStaticBlock = new InstanceAndStaticBlock();
		
		System.out.println("Mian");
		
		InstanceAndStaticBlock oInstanceAndStaticBlock2 = new InstanceAndStaticBlock();
	}
	
	static
	{
		System.out.println("SSB");
	}
	
	{
		System.out.println("SIB");
	}
}
