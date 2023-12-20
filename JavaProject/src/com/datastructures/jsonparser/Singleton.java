package com.datastructures.jsonparser;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7453476013966059418L;
	private volatile static Singleton instance;
	
	private Singleton() {
		System.out.println(this.hashCode());
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}
}
