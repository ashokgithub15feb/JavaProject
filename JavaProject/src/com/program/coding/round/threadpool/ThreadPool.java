package com.program.coding.round.threadpool;

public class ThreadPool {

	BlockingQueue <Runnable> queue;
	
    public ThreadPool(int queueSize, int nThread) {
    	
        queue = new BlockingQueue<>(queueSize);
        String threadName = null;
        TaskExecutor task = null;
        
        for (int count = 0; count < nThread; count++) 
        {
        	threadName = "Thread-"+count;
        	task = new TaskExecutor(queue);
            Thread thread = new Thread(task, threadName);
            thread.start();
        }
    }

    public void submitTask(Runnable task) throws InterruptedException {
        queue.enqueue(task);
    }
}
