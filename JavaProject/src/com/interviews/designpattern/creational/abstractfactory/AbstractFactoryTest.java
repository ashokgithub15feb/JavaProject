package com.interviews.designpattern.creational.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		ProductFactory productAFactory = new ProductAFactory();
		Product createProductA = productAFactory.createProduct();
		System.out.println("ProductA Name: "+createProductA.getProductName());
		
		
		ProductFactory productBFactory = new ProductBFactory();
		Product createProductB = productBFactory.createProduct();
		System.out.println("ProductB Name: "+createProductB.getProductName());
	}
}
