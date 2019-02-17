package com.durga.program.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog dog = new Dog();

		FileOutputStream fos = new FileOutputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\serialization\\abc.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(dog);
		
		FileInputStream fis = new FileInputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\serialization\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object readObject = ois.readObject();
		
		Dog g = (Dog) readObject;
		
		System.out.println("i: "+g.getI()+"\nj: "+g.getJ());
		System.out.println("Username: "+g.getUsername()+"\n"+"transient Password: "+g.getPassword());
		System.out.println("Static Veriable x: "+g.getX()+"\ntransient Static Veriable y: "+g.getY());
		System.out.println("Final Veriable z: "+g.getZ()+"\ntransient Final Veriable z1: "+g.getZ1());
		
		
	}
}

class Dog implements Serializable
{
	private int i = 10;
	private int j = 20;
	private String username = "ashok123@gmail.com";
	transient private String password = "1qaz2wsx"; //not to serialized
	private static int x = 200;
	private transient static int y = 300;
	private final int z = 400;
	private transient final int z1 = 500;
	
	
	public static int getY() {
		return y;
	}

	public static void setY(int y) {
		Dog.y = y;
	}

	public int getZ() {
		return z;
	}

	public int getZ1() {
		return z1;
	}

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		Dog.x = x;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
}