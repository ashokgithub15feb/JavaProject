package com.durga.program.java8.revies;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Ashok");
		
		Consumer<String> c1 = s -> System.out.println(s.length());
		Consumer<String> c2 = s -> System.out.println(s.length());
		c1.andThen(c2).accept("Ashok");
		
		Consumer<String> c3 = s -> System.out.println(s.substring(0, 1).toUpperCase()+".");
		Consumer<String> c4 = s -> System.out.println(s.substring(1));
		c3.andThen(c4).accept("yAshok");
	}
}
