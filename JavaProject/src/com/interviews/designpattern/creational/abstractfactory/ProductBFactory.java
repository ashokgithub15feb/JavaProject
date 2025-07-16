package com.interviews.designpattern.creational.abstractfactory;

public class ProductBFactory implements ProductFactory{

	@Override
	public Product createProduct() {
		return new ProductB();
	}
}
