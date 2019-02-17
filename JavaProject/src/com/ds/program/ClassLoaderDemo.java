package com.ds.program;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;

public class ClassLoaderDemo {
	
	public native void m1();

	class ASA1
	{
		
	}
	
	
	static class ASA2
	{
		
	}
	
	public static void main(String[] args) {

		System.out.println(ClassLoaderDemo.class.getClassLoader());

		System.out.println(ClassLoaderDemo.class.getClassLoader().getParent());
		
		System.out.println(ClassLoaderDemo.class.getClassLoader().getParent().getParent());
		
		System.out.println("==================================");
		
		System.out.println(HashMap.class.getClassLoader());
		//System.out.println(HashMap.class.getClassLoader().getParent());
		//System.out.println(HashMap.class.getClassLoader().getParent().getParent());
		
		System.out.println(Integer.class.getClassLoader());
		System.out.println(int.class.getClassLoader());
		
		String path = ClassLoaderDemo.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		
		class ASA
		{
			
		}
		
		try 
		{
			String decode = URLDecoder.decode(path,"UTF-8");
			
			System.out.println(decode);
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println();
		
		System.out.println("==================================");
		
		int i=1;
		
		for(;;)
		{
			if(i<100)
			{
				System.out.println(i);
				i++;
			}
			
			if(i==100)
			{
				break;
			}
			
			if(i ==10)
			{
				continue;
			}
		}
		
		
		//System.out.println("==================================");
		
//		try {
//			
//			//java.lang.ClassNotFoundException:
//			Class.forName("ClassLoaderDemo", true, ClassLoaderDemo.class.getClassLoader().getParent());
//			
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}
}
