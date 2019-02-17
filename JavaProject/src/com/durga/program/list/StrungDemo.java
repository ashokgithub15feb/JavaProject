package com.durga.program.list;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StrungDemo {

	static int i=0; 
	static Object obj = new Object();
	
	public static void main(String[] args) {
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		char[] ch = str.toCharArray();
		System.out.println("Number of Char: "+str.length());
		Runnable v = () -> {
			
			for(i=0; i<ch.length;i++)
			{
				synchronized(obj)
				{
					if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
//					if(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
					{
						System.out.println(ch[i]);
						obj.notify();
						
//						try
//						{
//							Thread.sleep(1000);
//						}catch (InterruptedException e) {
//							e.printStackTrace();
//						}
					}
					else
					{
						try
						{
							obj.wait();
						}catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		};
		
		Runnable c = () -> {
			
			for(i=0; i<ch.length;i++)
			{
				synchronized(obj)
				{
					if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z'))
//					if(ch[i] != 'A' || ch[i] != 'E' || ch[i] != 'I' || ch[i] != 'O' || ch[i] != 'U')
					{
						System.out.println(ch[i]);
						obj.notify();
						
//						try
//						{
//							Thread.sleep(1000);
//						}catch (InterruptedException e) {
//							e.printStackTrace();
//						}
					}
					else
					{
						try
						{
							obj.wait();
						}catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		};
				
		
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		service.submit(v);
		service.submit(c);
		
		service.shutdown();
	}
}
