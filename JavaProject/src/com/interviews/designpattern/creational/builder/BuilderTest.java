package com.interviews.designpattern.creational.builder;

public class BuilderTest {

	public static void main(String[] args) {
		
		CarBuilder carBuilder = new CarBuilder();
		carBuilder.setEngine("V8").setWheels(4).bild();
		Car car = new Car(carBuilder);
		
		String engine = car.getEngine();
		int wheels = car.getWheels();
		
		System.out.println("Car has an engine: "+engine+"\nAnd No. of Wheels: "+wheels);
	}
}
