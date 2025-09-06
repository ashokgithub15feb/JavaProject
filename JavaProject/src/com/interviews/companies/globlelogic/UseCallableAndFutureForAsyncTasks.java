package com.interviews.companies.globlelogic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Run tasks that return results asynchronously.

//Callable returns value; Future gets the result.


public class UseCallableAndFutureForAsyncTasks {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		 
	        ExecutorService executor = Executors.newSingleThreadExecutor();
	        Callable<String> callable = () -> "Hello from Callable";

	        Future<String> future = executor.submit(callable);
	        System.out.println("Result: " + future.get());

	        executor.shutdown();
	}
}
