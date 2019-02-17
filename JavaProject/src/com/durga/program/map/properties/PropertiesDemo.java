package com.durga.program.map.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\map\\properties\\abc.properties");
		
		p.load(fis);
		
		System.out.println(p);
		
		String emailId = p.getProperty("emailId");
		
		System.out.println(emailId);
		
		p.setProperty("emailId", "ashokcse126@gmail.com");
		
		System.out.println(p);
		
		FileOutputStream fos = new FileOutputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\map\\properties\\abc.properties");
		
		p.store(fos, "Updated by Ashok");
		
	}
}
