package com.durga.program.java8;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
		
		Consumer<Movie> c1 = m -> System.out.println(m.getName()+" Ready to release");
		Consumer<Movie> c2 = m -> System.out.println(m.getName()+" Released but it is bigger flop!!!!");
		Consumer<Movie> c3 = m -> System.out.println(m.getName()+" Storing Information in Database");
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		
		cc.accept(new Movie("Spider"));
	}
}

class Movie
{
	private String name;
	
	public Movie(String name) {
		this.name =name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}