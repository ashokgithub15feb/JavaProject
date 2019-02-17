package com.durga.program.array;

public class ArrayOfObject
{
	public static void main(String[] args)
	{
		User[] user = new User[10];
		
		//user[1].m1(); //java.lang.NullPointerException
		
		for(int i=0; i<user.length;i++)
		{
			user[i] = new User();
		}
		
		user[1].m1();
		
		Boolean[] a = new Boolean[3];
		System.out.println(a.getClass().getName());
		
		//int[] x = new int[-3];
		//System.out.println(x.getClass().getName());
		
		int[] x = new int['a'];
		System.out.println(x.getClass().getName());
	}
}

class User
{
	public void m1()
	{
		System.out.println("User class - Method m1()");
	}
}