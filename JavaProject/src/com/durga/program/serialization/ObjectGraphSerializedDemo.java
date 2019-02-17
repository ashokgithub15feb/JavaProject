package com.durga.program.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectGraphSerializedDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog1 dog1 = new Dog1();
		
		FileOutputStream fos = new FileOutputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\serialization\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dog1);
		
		FileInputStream fis = new FileInputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\serialization\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 d = (Dog1) ois.readObject();
		
		System.out.println("i: "+d.getC().getR().getI());
	}
}


class Dog1  implements Serializable
{
	public Cat1 getC() {
		return c;
	}

	public void setC(Cat1 c) {
		this.c = c;
	}

	private Cat1 c = new Cat1();
}

class Cat1  implements Serializable
{
	private Rat1 r = new Rat1();

	public Rat1 getR() {
		return r;
	}

	public void setR(Rat1 r) {
		this.r = r;
	}
}

class Rat1  implements Serializable
{
	private int i = 10;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}