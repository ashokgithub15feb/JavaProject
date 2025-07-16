package com.interviews.designpattern.creational.abstractfactory;

public class ProductAFactory implements ProductFactory{

	@Override
	public Product createProduct() {
		return new ProductA();
	}
}
