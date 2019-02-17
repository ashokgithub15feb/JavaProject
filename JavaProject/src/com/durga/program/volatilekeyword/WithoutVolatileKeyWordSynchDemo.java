package com.durga.program.volatilekeyword;

public class WithoutVolatileKeyWordSynchDemo {

	static int x = 0, y = 0;
    
    static synchronized void method1() {
           x++; y++;
    }
    static synchronized void method2() {
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
           
           thread1.start();
           thread2.start();
    }
}
/*//Output of this programs may not be that much conclusive because of unpredictable thread behaviour. 
	But our aim was to show that method2() will always observe same value for x and y.
x=0 y=0
x=0 y=0
x=0 y=0
x=0 y=0
x=0 y=0
x=0 y=0
x=0 y=0
x=0 y=0
x=0 y=0
x=0 y=0

x=10 y=10
x=10 y=10
x=10 y=10
x=10 y=10
x=10 y=10
x=10 y=10
x=10 y=10
x=10 y=10
x=10 y=10
x=10 y=10

*/