package com.interviews.designpattern.creational.factory;

public class FactoryTest {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		
		Shape circle = factory.getShape("CIRCLE");
		circle.drow();
		
		Shape ractabgle = factory.getShape("RACTANGLE");
		ractabgle.drow();
		
	}
}
