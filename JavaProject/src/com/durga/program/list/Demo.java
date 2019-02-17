package com.durga.program.list;

public class Demo {

	public static void main(String[] args) {
		
		int i = m1();
		
		System.out.println(i);
	}
	
	public static int m1()
	{
		try
		{
			int i = 10/0;
			return 10;
		}catch (Exception e) {
			System.out.println("Exception : "+e.getMessage());
			return 20;
		}finally
		{
			return 30;
		}
	}
}
