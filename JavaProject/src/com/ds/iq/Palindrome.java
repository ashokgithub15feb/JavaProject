package com.ds.iq;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		StringBuilder sb = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--)
		{
			sb.append(str.charAt(i));
		}
		
		if(str.equals(sb.toString()))
		{
			System.out.println(str+" :is palindrom ");
		}
		else
		{
			System.out.println(str+" :is not a palindrom ");
		}
		
		
		int num = 121;
		int x = num;
		int sum = 0;
		int rem = 0;
		
		while(x != 0)
		{
			rem = x % 10;
			sum = sum*10 + rem;
			x = x / 10;
		}
		
		if(sum == num)
		{
			System.out.println(num+" :Number is palindrome");
		}
		else
		{
			System.out.println(num+" :Number is not a palindrome");
		}
		
		Lock l = new ReentrantLock();
		try
		{
			l.lock();
			sb.wait();
			l.unlock();
			
		}catch (Exception e) {
		}
		
//		
//		try(InputStream is = new FileInputStream(new File("")))
//		{
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally
//		{
//			
//		}
		
		
		/*try
		{
			int s1 = 10/0;
			try
			{
				//	int s2 = 10/0;
				try
				{
					//int s = 10/0;
				}catch (Exception e) {
					// TODO: handle exception
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println();
		System.out.println(m1());
		System.out.println(m1(10));
	}
	
	public static int m1()
	{
		int j = 0;
		try
		{
			//return 10;
			j = 10;
			System.out.println(j);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finalll block");
			return j;
		}
	}
	
	public static int m1(int j)
	{
		try
		{
			//return 10;
			return j = 10+1/0;
		}
		catch (Exception e) {
			e.printStackTrace();
			return j;
		}
		finally {
			System.out.println("finalll block");
			return j-2;
		}
	}*/
	}
	
}

interface III{
	
	default III m1()
	{
		return null;
		
	}
	
	public static void main(String[] args)
	{
//		III.m1();
	}
	
}