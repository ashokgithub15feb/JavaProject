package com.program.coding.round.dp;

public class SingletonBullPoghMethod {

	private  SingletonBullPoghMethod() {
	}
	
	private static class SingletonHelper
	{
		private static final SingletonBullPoghMethod INSTANCE = new SingletonBullPoghMethod();
	}
	
	public static SingletonBullPoghMethod getInstance()
	{
		return SingletonHelper.INSTANCE;
	}
}
