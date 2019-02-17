package com.durga.program.reflaction;

public enum SingletonEnum {

	INSTANCE;
	//enum do not support lazy loading
	private SingletonEnum()
	{
		System.out.println("SingletonEnum Constructor");
	}
}
