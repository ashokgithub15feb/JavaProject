package com.durga.program.java8.revies;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("A", "a");
		map.put("B", "b");
		map.put("C", "c");
		map.put("D", "d");
		map.put("E", "e");
		
		System.out.println(map);
		
		map.entrySet().stream().forEach(k->System.out.println(k));
		System.out.println();
		map.entrySet().stream().forEach(System.out::println);
		System.out.println();
		map.keySet().stream().forEach(k -> System.out.println(k));
		
		map.values().stream().forEach(System.out::println);
		
		map.entrySet().stream().collect(Collectors.toList());
		
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("jjjjjjjjjj"));
		
		System.out.println();
		String strValue = "Python";
		// convert strValue to character array
		char[] values = strValue.toCharArray();
		// for each element on char array
		for(char c:values){
			// print the String value of char c
			System.out.println(String.valueOf(c));
		}
		
	}
}


@FunctionalInterface
interface JavaHungry<A, B, C> {

    public C apply(A a, B b);
 
    default void printString() {
        System.out.println("javahungry");
    }
}


 interface DefaultMethodInterface {
    default public void defaultMethod(){
       System.out.println("DefaultMethodInterface");        
    }
}

 interface DefaultMethodInterface2 {          
        default public void defaultMethod(){
               System.out.println("DefaultMethodInterface2");        
        }
}

 class HelloJava8 implements DefaultMethodInterface,DefaultMethodInterface2 {
   public static void main(String[] args){   
           DefaultMethodInterface defMethIn = new HelloJava8();
           defMethIn.defaultMethod();
           
           
           
           String nonFinal = "I am non final local variable";
/*           Runnable r = new Runnable() {
               @Override
               public void run() {
                   System.out.println("Using non-final local variable inside anonymous class in Java");
                   System.out.println("Value of non-final variable is : " + nonFinal);

                   // compile time error - must be final or effective final
                   // nonFinal = "Can I change non-final variable inside anonymous class";
               }
           };
*/           
           Runnable rr = () -> {
        	   
               System.out.println("Using non-final local variable inside anonymous class in Java");
               System.out.println("Value of non-final variable is : " + nonFinal);

           };

           Thread t = new Thread(rr);
           t.start();
    }

   public void defaultMethod(){
       System.out.println("HelloJava8"); 
   }
}
 
 
 
 