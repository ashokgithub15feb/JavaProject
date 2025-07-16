package com.interviews.designpattern.creational.builder;

public class CarBuilder {

	private String engine;
    private int wheels;
    
    public CarBuilder setEngine(String engine) {
    	this.engine = engine;
    	return this;
    }
    
    public CarBuilder setWheels(int wheels) {
    	this.wheels = wheels;
    	return this;
    }
    
    public Car bild() {
    	return new Car(this);
    }

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}
}
