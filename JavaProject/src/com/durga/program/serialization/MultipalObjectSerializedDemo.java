package com.durga.program.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MultipalObjectSerializedDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dag1 g = new Dag1();
		Cat c = new Cat();
		Rat r = new Rat();
		
		FileOutputStream fos = new FileOutputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\serialization\\abc.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(g);
		oos.writeObject(c);
		oos.writeObject(r);
		
		FileInputStream fis = new FileInputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\serialization\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		/*Dag1 g1 = (Dag1)ois.readObject();
		Cat c2 = (Cat) ois.readObject();
		Rat r2 = (Rat) ois.readObject();*/
		
		
		for(int i=0; i<=2; i++)
		{
			Object o = ois.readObject();
			
			if(o instanceof Dag1)
				System.out.println("Dog");
			else if(o instanceof Rat)
				System.out.println("Rat");
			else if(o instanceof Cat)
				System.out.println("Cat");
							
		}
		
		System.out.println("Serialization Done");
	}
}

class Dag1 implements Serializable
{
}

class Cat implements Serializable
{
}

class Rat implements Serializable
{
}