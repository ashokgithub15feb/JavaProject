package com.leetcode.patterns.arrays.revise;

public class Movie implements Comparable<Movie>{

	private String name;
	private double rating;
	private int year;
	
	public Movie(String name, double rating, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	
	public Movie() {
	}
	
	@Override
	public int compareTo(Movie o) {
		return this.year - o.year;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", year=" + year + "]";
	}
	
	
}
