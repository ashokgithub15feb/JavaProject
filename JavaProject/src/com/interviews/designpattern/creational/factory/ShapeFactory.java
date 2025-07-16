package com.interviews.designpattern.creational.factory;

public class ShapeFactory {

	public Shape getShape(String shapeType) {

		if (shapeType.equals(ShapeType.CIRCLE.name())) {
			return new Circle();
		} else if (shapeType.equals(ShapeType.RACTANGLE.name())) {
			return new Ractangle();
		} else {
			return null;
		}
	}
}
