package com.ds.iq;

public class ThrowExample {

	static void checkEligibilty(int stuage, int stuweight) throws MyException {
		if (stuage < 12 && stuweight < 40) {

			throw new MyException("Student is not eligible for registration");
		} else {
			System.out.println("Student Entry is Valid!!");
		}
	}

	// public static void main(String args[]) {
	// System.out.println("Welcome to the Registration process!!");
	// try {
	// checkEligibilty(10, 39);
	// } catch (Exception e) {
	// System.out.println(e.getMessage());
	// e.printStackTrace();
	// System.out.println(e.getLocalizedMessage()+": "+e.getClass());
	// }
	// System.out.println("Have a nice day..");
	// }

	public static void main(String args[]) throws MyException {
		System.out.println("Welcome to the Registration process!!");
		checkEligibilty(10, 39);
		System.out.println("Have a nice day..");
	}
}

class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6065938377700647039L;
	private String error;

	public MyException(String error) {
		/*
		 * Welcome to the Registration process!! Exception in thread "main" MyExceptio
		 * [error=Student is not eligible for registration] at
		 * com.subex.iq.ThrowExample.checkEligibilty(ThrowExample.java:8) at
		 * com.subex.iq.ThrowExample.main(ThrowExample.java:28)
		 * 
		 * Welcome to the Registration process!! Exception in thread "main" MyExceptio
		 * [error=Student is not eligible for registration] at
		 * com.subex.iq.ThrowExample.checkEligibilty(ThrowExample.java:8) at
		 * com.subex.iq.ThrowExample.main(ThrowExample.java:28)
		 * 
		 */
		// super(error);
		this.error = error;
	}

	@Override
	public String toString() {
		return "MyExceptio [error=" + error + "]";
	}

}