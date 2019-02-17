package com.durga.program.volatilekeyword;

public class WithoutVolatileKeyWordDemo {

	static int x = 0, y = 0;
    
    static void method1() {
           x++; y++;
    }
    static void method2() {
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

run least 100 times the you will get the cached output

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

*/