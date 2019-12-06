package com.program.coding.round.dp;

public class Singleton {

	private static Singleton instance;
	
	private Singleton()
	{
	}
	
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			synchronized (Singleton.class) {
				
				if(instance == null)
				{
					instance = new Singleton();
				}
				
			}
		}
		
		return instance;
	}
}
