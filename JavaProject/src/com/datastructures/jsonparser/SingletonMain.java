package com.datastructures.jsonparser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonMain {

	public static void main(String[] args) {
		
		breakSingletonMethod1();
		breakSingletonMethod2();
		breakSingletonMethod3();
		
	}

	private static void breakSingletonMethod3() {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = null;
		try {
			instance2 = (Singleton) instance1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone Not Supported Exception: "+e.getCause());
		}
		System.out.println("Using Cloneable Class break Instance 1: "+instance1.hashCode());
		System.out.println("Using Cloneable Class break Instance 2: "+instance2.hashCode());
		
	}

	@SuppressWarnings("null")
	private static void breakSingletonMethod2() {
		Singleton instance1 = Singleton.getInstance();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			System.out.println("Serializable - Strat");
			fos = new FileOutputStream("file.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(instance1);
			System.out.println("Serializable - End");

			System.out.println("Deserializable - Strat");

			fis = new FileInputStream("file.txt");
			ois = new ObjectInputStream(fis);
			
			Singleton instance2 = (Singleton) ois.readObject();
			
			System.out.println("Using Serializable Singleton Class break Instance 1: "+instance1.hashCode());
			System.out.println("Using Serializable Singleton Class break Instance 2: "+instance2.hashCode());
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				oos.close();
				ois.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void breakSingletonMethod1() {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = null;
		
		try {
			Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
			
			for(Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instance2 = (Singleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
            e.printStackTrace();
        }
		
		System.out.println("Using Reflection API Singleton Class break Instance 1: "+instance1.hashCode());
		System.out.println("Using Reflection API Singleton Class break Instance 2: "+instance2.hashCode());
	}
}
