package com.durga.program.map;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BinaryAndLinerSearchDeSerialize {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\map\\abc.ser");
			
			ois = new ObjectInputStream(fis);
			
			BinerySeachDemo search = (BinerySeachDemo) ois.readObject();
			
			System.out.println(search.getName()+":"+search.getNum());

			System.out.println("DeSerialization-Done");
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
