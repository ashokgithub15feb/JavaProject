package com.durga.program.java8.revies;

public class ContructorReferenceDemo {

	public static void main(String[] args) {
		
		PrivateConstructor instance = PrivateConstructor.getInstance();
		
		System.out.println(instance.hashCode());
		
		
		II2 bb = PrivateConstructor::getInstance;
		System.out.println(bb.hashCode());
		
		PrivateConstructor int1 = PrivateConstructor.getInt();
		System.out.println(int1.hashCode());
		
		II4 b2 = PrivateConstructor::getInt;
		System.out.println(b2.hashCode());
		
		System.out.println("==========================");
		
		EnumSingleton instance2 = EnumSingleton.INSTANCE;
		System.out.println(instance2.hashCode());
		
		KI j = EnumSingleton::doSomething;
		System.out.println(j.hashCode());
	}
}


class PrivateConstructor
{
	private static PrivateConstructor p;
	
	private PrivateConstructor() {
		
		System.out.println("Private Constructor class");
	}
	
	public static PrivateConstructor getInstance()
	{
		if(p==null)
		{
			p = new PrivateConstructor();
			System.out.println("a");
		}
		
		return p;
	}
	
	public static PrivateConstructor getInt()
	{
		return CCC.pp;
	}
	
	private static class CCC
	{
		private static final PrivateConstructor pp = new PrivateConstructor();
	}
}

interface II2
{
	public PrivateConstructor getInstance();
}

interface II4
{
	public PrivateConstructor getInt();
}


enum EnumSingleton {

    INSTANCE;
    
	EnumSingleton()
	{
		
	}
	
    public static void doSomething(){
        //do something
    }
}

interface KI
{
	public void doSomethingEnum();
}