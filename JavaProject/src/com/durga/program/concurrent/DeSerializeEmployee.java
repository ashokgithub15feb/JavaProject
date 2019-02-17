package com.durga.program.concurrent;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeSerializeEmployee {

	public static void main(String[] args) {
		try {
			InputStream fin = new FileInputStream("ser.txt");
			ObjectInput oin = new ObjectInputStream(fin);

			System.out.println("DeSerialization process has started, displaying employee objects...");
			Object emp;
			
			while ((emp = oin.readObject()) instanceof EofIndicatorClass) {
				System.out.println(emp);
			}
			fin.close();
			oin.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Object deSerialization completed.");

	}
}

/*
DeSerialization process has started, displaying employee objects...
java.io.InvalidClassException: com.durga.program.concurrent.Employee; 
    local class incompatible: stream classdesc serialVersionUID = -2311657628024715227, 
    local class serialVersionUID = 5747161883505031904
	at java.io.ObjectStreamClass.initNonProxy(Unknown Source)
	at java.io.ObjectInputStream.readNonProxyDesc(Unknown Source)
	at java.io.ObjectInputStream.readClassDesc(Unknown Source)
	at java.io.ObjectInputStream.readOrdinaryObject(Unknown Source)
	at java.io.ObjectInputStream.readObject0(Unknown Source)
	at java.io.ObjectInputStream.readObject(Unknown Source)
	at com.durga.program.concurrent.DeSerializeEmployee.main(DeSerializeEmployee.java:18)
Object deSerialization completed.

*/