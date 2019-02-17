package com.durga.program.java8.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdDemo {

	public static void main(String[] args) {
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone); //Asia/Calcutta

		System.out.println("America Date Time and Zone");
		
		ZoneId z = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(z);
		System.out.println(zdt);
		
	}
}
