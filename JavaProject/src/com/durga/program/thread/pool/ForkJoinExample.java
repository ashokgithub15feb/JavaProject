package com.durga.program.thread.pool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinExample {

	public static void main(String[] args) {
		 
        ForkJoinPool forkJoinPool=new ForkJoinPool();
        long startNanoSec=0;
        long endNanoSec=0;
        
        long[] numberAr=new long[100000];
        for(int i=0;i<100000;i++){
               numberAr[i]=i;
        }

        System.out.print("original array : ");
        for(int i=0;i<10;i++){
               System.out.print(numberAr[i]+" ");
        }
        
        MyRecursiveAction task=new MyRecursiveAction(0,numberAr.length,numberAr);

        
        startNanoSec=System.nanoTime();
        forkJoinPool.invoke(task);
        endNanoSec=System.nanoTime();
        
        System.out.print("\narray after being processed recursively "
                     + "using RecursiveAction : ");
        for(int i=0;i<10;i++){
               System.out.print(numberAr[i]+" ");
        }
        
        System.out.println();
        System.out.println("Level of Parallelism > "+
                                          forkJoinPool.getParallelism());
        System.out.print("Time taken to complete task : "+
                                          (endNanoSec-startNanoSec)+" nanoSeconds");
        
        
        
 }
}

/*
* MyRecursiveAction extends  RecursiveAction,
* RecursiveAction extends ForkJoinTask.
*/
class MyRecursiveAction extends RecursiveAction{
   
   //Part of array on which computation will be performed.
   int start;
   int end;
   
   //Array on which computation will be done recursively.
   long[] numberAr;
   
   
   public MyRecursiveAction(int start, int end, long[] numberAr) {   
          this.start=start;
          this.end=end;
          this.numberAr=numberAr;
   }
   

   /* computation will be performed in this method
    * and method won't return any result.
    */
   @Override
   protected void compute() {
   
          /* We divide array into small arrays, as small as minimumProcessingSize.
           * So that each processor could efficiently process smaller array, using this
           * approach enables work-stealing approach to comes into picture.
           */
          int minimumProcessingSize=100;
          
          //Array is small enough to be processed, we need not to divide array.
          if(end-start < minimumProcessingSize){
                 for (int i = start; i < end; i++) {
                       numberAr[i]=numberAr[i]*numberAr[i];
                 }
          }
          //divide array in small arrays.
          else {
                 int mid= (start+end)/2;
                 invokeAll(new MyRecursiveAction(start, mid, numberAr),
                              new MyRecursiveAction(mid, end, numberAr));
          }
   }
}