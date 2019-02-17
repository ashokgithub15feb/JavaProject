package com.durga.program.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InheritanceSerializationFCTPDemo {

		public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog4 d = new Dog4();
		d.setName("Cat");
		d.setAnimalKing("Tiger");
		
		FileOutputStream fos = new FileOutputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\serialization\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis = new FileInputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\serialization\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog4 dd = (Dog4) ois.readObject();
		
		System.out.println("Child: "+dd.getName()+"\nParent: "+dd.getAnimalKing());
	}
}

class Animal1
{
	private String animalKing = "Loin";

	/*public Animal1() { //Exception in thread "main" java.io.InvalidClassException
	}*/
	
	public Animal1() {
		System.out.println("Animal Contractor");
	}
	/*public Animal1(int i) {
		System.out.println("Parent i value: assinged from child super block: "+i);
	}*/
	public String getAnimalKing() {
		return animalKing;
	}

	public void setAnimalKing(String animalKing) {
		this.animalKing = animalKing;
	}

}
class Dog4 extends Animal1 implements Serializable
{
	private String name = "Dog";
	
	public Dog4() {
		//super(10);
		System.out.println("Child Contructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
