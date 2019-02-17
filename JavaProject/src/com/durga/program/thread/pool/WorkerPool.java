package com.durga.program.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WorkerPool {

	public static void main(String args[]) throws InterruptedException{
        //RejectedExecutionHandler implementation
        RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();
        //Get the ThreadFactory implementation to use
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        //creating the ThreadPoolExecutor
        
        /**
         * Open Declaration java.util.concurrent.ThreadPoolExecutor.ThreadPoolExecutor(int corePoolSize, 
         * int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, 
         * ThreadFactory threadFactory, RejectedExecutionHandler handler)
         * 
         * #parameters
         * corePoolSize = 2
         * maximumPoolSize = 4
         * keepAliveTime = 10
         * unit = TimeUnit.SECONDS
         * workQueue = new ArrayBlockingQueue<Runnable>(2)
         * threadFactory,
         * rejectionHandler
         */
        ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, 
        		new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectionHandler);
        //start the monitoring thread
        
        MyMonitorThread monitor = new MyMonitorThread(executorPool, 3);
        
        Thread monitorThread = new Thread(monitor);
        monitorThread.start();
        //submit work to the thread pool
        int jobs = 10;
        for(int i=0; i<jobs; i++){
            executorPool.execute(new WorkerThread("cmd"+i));
        }
        
        Thread.sleep(30000);
        //shut down the pool
        executorPool.shutdown();
        //shut down the monitor thread
        Thread.sleep(5000);
        monitor.shutdown();
        
    }
}

/**
pool-1-thread-2 Start. Command = cmd1
cmd6 is rejected
cmd7 is rejected
cmd8 is rejected
cmd9 is rejected
pool-1-thread-3 Start. Command = cmd4
pool-1-thread-1 Start. Command = cmd0
pool-1-thread-4 Start. Command = cmd5
[monitor] [0/2] Active: 0, Completed: 0, Task: 6, isShutdown: false, isTerminated: false


[monitor] [4/2] Active: 4, Completed: 0, Task: 6, isShutdown: false, isTerminated: false


pool-1-thread-2 End.
pool-1-thread-1 End.
pool-1-thread-2 Start. Command = cmd2
pool-1-thread-3 End.
pool-1-thread-3 Start. Command = cmd3
pool-1-thread-4 End.


[monitor] [4/2] Active: 2, Completed: 4, Task: 6, isShutdown: false, isTerminated: false


[monitor] [4/2] Active: 2, Completed: 4, Task: 6, isShutdown: false, isTerminated: false


pool-1-thread-3 End.
pool-1-thread-2 End.


[monitor] [4/2] Active: 0, Completed: 6, Task: 6, isShutdown: false, isTerminated: false


[monitor] [2/2] Active: 0, Completed: 6, Task: 6, isShutdown: false, isTerminated: false


[monitor] [2/2] Active: 0, Completed: 6, Task: 6, isShutdown: false, isTerminated: false


[monitor] [2/2] Active: 0, Completed: 6, Task: 6, isShutdown: false, isTerminated: false


[monitor] [2/2] Active: 0, Completed: 6, Task: 6, isShutdown: false, isTerminated: false


[monitor] [2/2] Active: 0, Completed: 6, Task: 6, isShutdown: false, isTerminated: false


[monitor] [0/2] Active: 0, Completed: 6, Task: 6, isShutdown: true, isTerminated: true


[monitor] [0/2] Active: 0, Completed: 6, Task: 6, isShutdown: true, isTerminated: true

**/