
package com.durga.program.volatilekeyword;

public class WithtVolatileKeyWordDemo {

	 private static volatile int x = 0;
	 private static volatile int y = 0;
	    
	    private static void method1() {
	    	
	    	synchronized (WithtVolatileKeyWordDemo.class) {
				
	    		x++; y++;
			}
	    }
	    private static void method2() {
	    	
	           System.out.println("x=" + x + " y=" + y);
	    }
	    
	    public static void main(String[] args) {
	    	
	           Thread thread1=new Thread(){
	                  public void run(){
	                        for(int i=0; i<10;i++)
	                               method1();
	                        
	                  }
	           };
	 
	           Thread thread2=new Thread(){
	        	   
	                  public void run(){
	                        for(int i=0; i<10;i++)
	                               method2();
	                        
	                  }
	           };
	           
	           //thread1.start();
	           //thread2.start();
	           
	           
	           System.out.println("A".hashCode());
	           
	           System.out.println("AA".hashCode());
	           System.out.println("aa".hashCode());
	           
	           
	    }
}

/*//https://www.javamadesoeasy.com/2015/03/volatile-keyword-in-java-difference.html
 This allows method1() & method2() to be executed concurrently, 
 but assures that accesses to the shared values for x and y occur exactly as many times,
 and in exactly the same order, as they appear to occur during execution of the program text by each thread. 
 Therefore, the shared value for y is never greater than that for x, 
 because each update to x must be reflected in the shared value for x before the update to y occurs. 
It is possible, however, that certain invocation of method2() might note a value for y that is much greater than the value noted for x, because method1() might be executed many times between the moment when method2() fetches the value of x and the moment when method2() fetches the value of y.
*/