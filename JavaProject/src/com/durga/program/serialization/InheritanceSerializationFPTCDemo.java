package com.durga.program.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InheritanceSerializationFPTCDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog3 d = new Dog3();
		
		FileOutputStream fos = new FileOutputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\serialization\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis = new FileInputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\serialization\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog3 dd = (Dog3) ois.readObject();
		
		System.out.println(dd.getLegs()+"\n"+dd.getName()+"\n"+dd.getAnimalName());
	}
}

class Animal implements Serializable
{
	private String animalName = "Loin";
	
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
}

class Dog3 extends Animal
{
	private int legs = 4;
	private String name = "Dog";
	
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
