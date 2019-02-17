package com.durga.program.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizedSerializedDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Account account = new Account();
		
		FileOutputStream fos = new FileOutputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\serialization\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(account);
		
		FileInputStream fis = new FileInputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\serialization\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account accountDeSerialized = (Account) ois.readObject();
		
		System.out.println("Username: "+accountDeSerialized.getUsername()+"\n"+"Password: "+accountDeSerialized.getPassword()+
				"\nPin Code: "+accountDeSerialized.getPin());
		
	}
}

class Account implements Serializable
{
	private String username = "Anushka";
	private transient String password = "anushka123";
	private transient int pin = 560103;
	
	private void writeObject(ObjectOutputStream oos) throws Exception
	{
		oos.defaultWriteObject(); //meant for default serialization
		
		String epwd = "123"+password;
		
		// here serializing one more extra-object
		oos.writeObject(epwd); //meant for customized serialization
		
		int epin = 560103+560037+560042-560001;
		
		oos.writeInt(epin);
	}
	
	//order should be maintain - write-read
	private void readObject(ObjectInputStream ois) throws Exception
	{
		ois.defaultReadObject(); //meant for default De-serialization
		
		//de-serialized extra-object
		String epwd = (String) ois.readObject(); //meant for customized De-serialization
		password = epwd.substring(3);
		
		int epin = ois.readInt();
		pin = epin-560037-560042+560001;
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

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}