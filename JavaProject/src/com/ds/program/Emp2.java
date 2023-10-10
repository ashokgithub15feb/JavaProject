package com.ds.program;

import java.lang.reflect.ReflectPermission;
import java.security.Permission;

public final class Emp2 {

	private String abc;
	private int data;
	
	private Emp2() {
		System.setSecurityManager(new SecurityManager());
		System.out.println("Default constructor");
	}
	
	private Emp2(String abc, int data) {
		super();
		System.setSecurityManager(new SecurityManager());
		this.abc = abc;
		this.data = data;
		System.out.println("Argument constructor");
	}

	private String getAbc() {
		System.out.println("getAbc");
		return abc;
	}

	private void setAbc(String abc) {
		System.out.println("setAbc");
		this.abc = abc;
	}

	private int getData() {
		System.out.println("getData");
		return data;
	}

	private void setData(int data) {
		System.out.println("setData");
		this.data = data;
	}
	
	private static void setSecuritymanager() { 
		 
	    System.setSecurityManager(new SecurityManager() { 
	        @Override 
	        public void checkPermission(Permission perm) { 
	             if (perm.getClass() == ReflectPermission.class && "suppressAccessChecks".equals(perm.getName())) { 
	                throw new SecurityException("can't supress AccessChecks"); 
	            } 
	        } 
	    }); 
	} 
}
