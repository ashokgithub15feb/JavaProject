package com.durga.program.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

	public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5); //5 thread pool
        
        int jobs = 10; // 10 jobs
        for (int i = 1; i <= jobs; i++) { 
        	
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
          
        }
        executor.shutdown();
        
        while (!executor.isTerminated()) {
        }
        
        System.out.println("Finished all threads");
    }
}

/**
pool-1-thread-3 Start. Command = 3
pool-1-thread-5 Start. Command = 5
pool-1-thread-1 Start. Command = 1
pool-1-thread-4 Start. Command = 4
pool-1-thread-2 Start. Command = 2


pool-1-thread-3 End.
pool-1-thread-3 Start. Command = 6
pool-1-thread-1 End.
pool-1-thread-1 Start. Command = 7
pool-1-thread-2 End.
pool-1-thread-4 End.
pool-1-thread-5 End.
pool-1-thread-4 Start. Command = 9
pool-1-thread-2 Start. Command = 8
pool-1-thread-5 Start. Command = 10


pool-1-thread-3 End.
pool-1-thread-4 End.
pool-1-thread-2 End.
pool-1-thread-5 End.
pool-1-thread-1 End.
Finished all threads

**/