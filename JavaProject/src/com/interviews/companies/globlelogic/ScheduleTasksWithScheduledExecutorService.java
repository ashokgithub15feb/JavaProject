package com.interviews.companies.globlelogic;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Run tasks periodically or after delays.
//Schedules task repeatedly with fixed intervals.



public class ScheduleTasksWithScheduledExecutorService {

	public static void main(String[] args) {
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        Runnable task = () -> System.out.println("Running task at " + System.currentTimeMillis());

        executor.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
	}
}
