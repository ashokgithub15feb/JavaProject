package com.interviews.designpattern.creational.builder;

public class Car {

	private String engine;
    private int wheels;

    public Car(CarBuilder carBuilder) {
    	this.engine = carBuilder.getEngine();
    	this.wheels = carBuilder.getWheels();
    }

	public String getEngine() {
		return engine;
	}
	public int getWheels() {
		return wheels;
	}
    
    
}
