package com.interview.program;

public class StaticInitilization implements Cloneable{

	public static String m1(String msg)
	{
		System.out.println(msg);
		return msg;
	}
	
	static String m = m1("1");
	
	{
		m = m1("2");
	}
	
	static {
		m = m1("3");
	}
	
	abstract class AAA
	{
		private AAA()
		{
			
		}
	}
	
	public StaticInitilization()
	{
		m = m1("4");
	}
	
	public static void main(String[] args) {
		
		Object o = new StaticInitilization();
		System.out.println("Main");
		
		
		try {
		
			Object newInstance = Class.forName("com.durga.program.StaticInitilization").newInstance();
			
			if(newInstance instanceof StaticInitilization)
			{
				StaticInitilization oStaticInitilization = (StaticInitilization) newInstance;
				
				System.out.println(oStaticInitilization.m1("Calling from Main method"));
				
				try {
					StaticInitilization StaticInitilizationo2 = (StaticInitilization) oStaticInitilization.clone();
					
				
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
			}
			
		
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}


interface II
{
	public static void m4() {
	}
	
	public void m2();
}